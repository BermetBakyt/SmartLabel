package com.example.smartlabelling.data.remote.dto

import com.google.gson.annotations.SerializedName

class ProductApiResponse<T>(
@SerializedName("results")
val results: List<T>
)
