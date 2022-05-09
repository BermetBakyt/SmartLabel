package com.example.smartlabelling.data.repository

import com.example.smartlabelling.data.remote.services.ProductServiceApi
import com.example.smartlabelling.domain.repository.ProductDetailRepository
import javax.inject.Inject

class RepositoryImpl @Inject constructor(
) : BaseRepository(), ProductDetailRepository {

    }
