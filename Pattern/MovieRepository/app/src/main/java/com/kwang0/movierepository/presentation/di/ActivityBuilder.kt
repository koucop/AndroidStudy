package com.kwang0.movierepository.presentation.di

import com.kwang0.movierepository.presentation.di.detail.DetailActivityModule
import com.kwang0.movierepository.presentation.di.main.MainActivityModule
import com.kwang0.movierepository.presentation.view.DetailActivity
import com.kwang0.movierepository.presentation.view.MainActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class ActivityBuilder {

    @ContributesAndroidInjector(modules = [(MainActivityModule::class)])
    @PerActivity
    internal abstract fun bindMainActivity(): MainActivity

    @ContributesAndroidInjector(modules = [(DetailActivityModule::class)])
    @PerActivity
    internal abstract fun bindDetailActivity(): DetailActivity

}