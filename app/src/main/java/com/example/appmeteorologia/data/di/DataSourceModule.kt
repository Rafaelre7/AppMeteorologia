package com.example.appmeteorologia.data.di

import com.example.appmeteorologia.data.KtorRemoteDataSource
import com.example.appmeteorologia.data.remote.RemoteDataSource
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class) //falando que vai ser usando em um contexto geral no app
interface DataSourceModule {

    @Binds
    @Singleton //injetando apenas uma instancia
    fun bindRemoteDataSource(remoteDataSource: KtorRemoteDataSource): RemoteDataSource
}