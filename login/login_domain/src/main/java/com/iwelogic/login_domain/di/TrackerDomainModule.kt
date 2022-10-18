package com.iwelogic.login_domain.di

import com.iwelogic.login_domain.repository.LoginRepository
import com.iwelogic.login_domain.use_cases.LoginUseCase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent
import dagger.hilt.android.scopes.ViewModelScoped

@Module
@InstallIn(ViewModelComponent::class)
object TrackerDomainModule {

    @ViewModelScoped
    @Provides
    fun provideTrackerUseCases(
        repository: LoginRepository
    ): LoginUseCase {
        return LoginUseCase(repository)
    }
}