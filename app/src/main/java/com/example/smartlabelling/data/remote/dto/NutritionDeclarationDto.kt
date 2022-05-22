package com.example.smartlabelling.data.remote.dto

import com.google.gson.annotations.SerializedName

class NutritionDeclarationDto(
    @SerializedName("energy")
    val energy: Int,
    @SerializedName("fats")
    val fats: Int,
    @SerializedName("proteins")
    val proteins: Int,
    @SerializedName("sugar")
    val sugar: Int,
    @SerializedName("salt")
    val salt: Int,
)