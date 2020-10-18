package com.kwang0.layout.common

import android.app.Application

class App : Application() {

    override fun onCreate() {
        super.onCreate()

        appContext = this
    }

    companion object {
        @JvmStatic
        lateinit var appContext: App
    }
}