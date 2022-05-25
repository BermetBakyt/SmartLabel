package com.example.smartlabelling.presentation.presentation.models

data class NutritionDeclarationUI(
    val energy: Int,
    val fats: Int,
    val proteins: Int,
    val sugar: Int,
    val salt: Int,
)

fun com.example.domain.models.NutritionDeclaration.toNutritionDeclarationUI() = NutritionDeclarationUI(
    energy, fats, proteins, sugar, salt
)