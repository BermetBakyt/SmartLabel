package com.example.smartlabelling.domain.models

class Product(
    val id: Int,
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
    val productImage: String
)
