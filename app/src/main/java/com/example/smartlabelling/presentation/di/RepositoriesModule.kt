package com.example.smartlabelling.presentation.di

import com.example.data.repository.ProductRepositoryImpl
import com.example.domain.repository.ProductRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
abstract class RepositoriesModule {

    @Binds
    abstract fun bindCharacterRepository(repositoryImpl: com.example.data.repository.ProductRepositoryImpl): com.example.domain.repository.ProductRepository
}