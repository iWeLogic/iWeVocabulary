package com.iwelogic.login_presentation

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.iwelogic.login_domain.use_cases.LoginUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class LoginViewModel @Inject constructor(
    private val loginUseCase: LoginUseCase
) : ViewModel() {

    fun onClickLogin() {
        viewModelScope.launch {
            loginUseCase.invoke("asda", "asda").onSuccess {
                Log.w("myLog", "Success")
            }.onFailure {
                Log.w("myLog", "Failure")
            }
        }
    }
}