package com.iwelogic.login_data.models

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class RegisterData(

    @field:SerializedName("email")
    @Expose
    val email: String? = null,

    @field:SerializedName("image")
    @Expose
    val image: String? = null,

    @field:SerializedName("firstName")
    @Expose
    val firstName: String? = null,

    @field:SerializedName("lastName")
    @Expose
    val lastName: String? = null,

    @field:SerializedName("password")
    @Expose
    val password: String? = null
)
