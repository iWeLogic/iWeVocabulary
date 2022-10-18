package com.iwelogic.login_data.mapper

import com.iwelogic.login_data.models.UserData
import com.iwelogic.login_domain.models.UserDomain

fun UserData?.toUserDomain(): UserDomain? {
    return UserDomain(
        objectId = this?.objectId ?: return null,
        firstName = firstName,
        lastName = lastName,
        image = image,
        email = email,
        userToken = userToken
    )
}