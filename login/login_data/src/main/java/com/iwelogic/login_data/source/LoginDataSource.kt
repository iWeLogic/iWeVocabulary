package com.iwelogic.login_data.source

import com.iwelogic.login_data.models.SignInData
import com.iwelogic.login_data.models.UserData

interface LoginDataSource {

    suspend fun login(data: SignInData): Result<UserData?>
}