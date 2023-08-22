package com.example.vixproject.main

import android.app.Application
import com.example.vixproject.di.AppModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin
import org.koin.ksp.generated.module

class VixApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidContext(this@VixApplication)
            modules(AppModule().module)
        }
    }
}