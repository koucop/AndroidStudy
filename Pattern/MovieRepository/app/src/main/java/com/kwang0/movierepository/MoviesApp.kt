package com.kwang0.movierepository

import com.kwang0.movierepository.presentation.di.app.DaggerAppComponent
import dagger.android.AndroidInjector
import dagger.android.DaggerApplication

class MoviesApp: DaggerApplication() {

    override fun applicationInjector(): AndroidInjector<MoviesApp> {
        val component = DaggerAppComponent.builder().application(this).build();
        component.inject(this);
        return component
    }

}