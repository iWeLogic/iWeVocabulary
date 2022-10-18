package com.iwelogic.login_domain.use_cases

import com.iwelogic.login_domain.models.UserDomain
import com.iwelogic.login_domain.repository.LoginRepository

class LoginUseCase(val repository: LoginRepository) {

    suspend fun invoke(login: String, password: String): Result<UserDomain?> {
        return repository.login(login, password)
    }
}
