package com.iwelogic.login_data.source

import com.iwelogic.core.BaseDataSource
import com.iwelogic.login_data.LoginApi
import com.iwelogic.login_data.models.SignInData
import com.iwelogic.login_data.models.UserData

class LoginDataSourceImp(private val api: LoginApi) : BaseDataSource(), LoginDataSource {

    override suspend fun login(data: SignInData): Result<UserData?> {
        return getResponse(request = { api.login(data) })
    }
}