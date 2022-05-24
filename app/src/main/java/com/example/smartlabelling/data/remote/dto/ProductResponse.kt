package com.example.smartlabelling.data.remote.dto

import com.google.gson.annotations.SerializedName

class ProductResponse<T> (
    @SerializedName("results")
    val results: List<T>
        )