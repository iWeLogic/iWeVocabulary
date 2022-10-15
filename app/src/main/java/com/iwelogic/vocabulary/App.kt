package com.iwelogic.vocabulary

import android.app.Application
import coil.ImageLoader
import coil.ImageLoaderFactory
import com.iwelogic.vocabulary.utils.UnsplashSizingInterceptor
import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp
class App : Application(), ImageLoaderFactory {

    override fun newImageLoader(): ImageLoader {
        return ImageLoader.Builder(this)
            .components { add(UnsplashSizingInterceptor) }
            .build()
    }
}