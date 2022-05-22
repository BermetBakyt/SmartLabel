package com.example.smartlabelling.data.remote.dto

import com.google.gson.annotations.SerializedName

class ProductDto(
    @SerializedName("id")
    val id: Int,
    @SerializedName("product_name")
    val productName: String,
    @SerializedName("production_date")
    val productionDate: String,
    @SerializedName("expiry_date")
    val expiryDate: String,
    @SerializedName("manifacturer_country")
    val manifacturerCountry: String,
    @SerializedName("ingredients")
    val ingredients: String,
    @SerializedName("category")
    val category: String,
    @SerializedName("packaging_size")
    val packagingSize: Int,
    @SerializedName("series_number")
    val seriesNumber: Int,
    @SerializedName("nutrition_declaration")
    val nutritionDeclarationDto: NutritionDeclarationDto,
    @SerializedName("consumption_info")
    val consumptionInfo: ConsumptionInfoDto,
)