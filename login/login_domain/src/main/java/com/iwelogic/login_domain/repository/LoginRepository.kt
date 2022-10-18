package com.iwelogic.login_domain.repository

import com.iwelogic.login_domain.models.UserDomain


interface LoginRepository {

    suspend fun login(login: String, password: String): Result<UserDomain?>
}