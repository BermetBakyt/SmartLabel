package com.example.smartlabelling.domain.models

import com.example.smartlabelling.data.remote.dto.NutritionDeclarationDto

class Product(
    val id: Int,
    val productName: String,
    val productionDate: String,
    val expiryDate: String,
    val manifacturerCountry: String,
    val ingredients: String,
    val category: String,
    val packagingSize: Int,
    val seriesNumber: Int,
    val nutritionDeclaration: NutritionDeclaration,
    val consumptionInfo: ConsumptionInfo,
)

fun NutritionDeclarationDto.toNutritionDeclarationUI() = NutritionDeclaration (
    energy,
    fats,
    proteins,
    sugar,
    salt
)