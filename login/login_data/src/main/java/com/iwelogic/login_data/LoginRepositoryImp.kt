package com.iwelogic.login_data

import com.iwelogic.core.ErrorHolder
import com.iwelogic.login_data.mapper.toUserDomain
import com.iwelogic.login_data.models.SignInData
import com.iwelogic.login_data.source.LoginDataSource
import com.iwelogic.login_domain.models.UserDomain
import com.iwelogic.login_domain.repository.LoginRepository

class LoginRepositoryImp(private val dataSource: LoginDataSource) : LoginRepository {

    override suspend fun login(login: String, password: String): Result<UserDomain?> {
        return dataSource.login(SignInData(login, password)).let {
            if (it.isSuccess) Result.success(it.getOrNull()?.toUserDomain())
            else Result.failure(it.exceptionOrNull() ?: ErrorHolder("Something went wrong"))
        }
    }
}