package com.example.smartlabelling.presentation.ui.models

import com.example.smartlabelling.domain.models.*
import com.example.smartlabelling.presentation.base.IBaseDiffModel

data class ProductUI(
    override val id: Int,
    val productName: String,
    val productionDate: String,
    val expiryDate: String,
    val manifacturerCountry: String,
    val ingredients: List<String>,
    val category: String,
    val packagingSize: Int,
    val seriesNumber: Int,
    val nutritionDeclaration: NutritionDeclarationUI,
    val consumptionInfo: ConsumptionInfoUI,
    val productImage: String
): IBaseDiffModel

fun Product.toProductUI() = ProductUI(
    id,
    productName,
    productionDate,
    expiryDate,
    manifacturerCountry,
    ingredients,
    category,
    packagingSize,
    seriesNumber,
    nutritionDeclaration.toNutritionDeclarationUI(),
    consumptionInfo.toConsumptionInfoUI(),
    productImage,
)