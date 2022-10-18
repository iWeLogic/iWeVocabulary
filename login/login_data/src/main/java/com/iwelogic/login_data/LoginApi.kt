package com.iwelogic.login_data

import com.iwelogic.login_data.models.RegisterData
import com.iwelogic.login_data.models.SignInData
import com.iwelogic.login_data.models.UserData
import retrofit2.Response
import retrofit2.http.*

interface LoginApi {

    @POST("/api/users/register")
    suspend fun register(@Body registerData: RegisterData): Response<Any>

    @POST("/api/users/login")
    suspend fun login(@Body registerData: SignInData): Response<UserData>
}