package com.example.smartlabelling.presentation.di

import com.example.smartlabelling.data.repository.ProductRepositoryImpl
import com.example.smartlabelling.domain.repository.ProductRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
abstract class RepositoriesModule {

    @Binds
    abstract fun bindCharacterRepository(repositoryImpl: ProductRepositoryImpl): ProductRepository
}