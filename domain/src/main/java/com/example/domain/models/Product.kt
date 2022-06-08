package com.example.domain.models

class Product(
    val objectId: String,
    val productName: String,
    val productionDate: String,
    val expiryDate: String,
    val manifacturerCountry: String,
    val ingredients: List<String>,
    val category: String,
    val packagingSize: Int,
    val seriesNumber: Int,
    val nutritionDeclaration: NutritionDeclaration,
    val consumptionInfo: ConsumptionInfo,
)
