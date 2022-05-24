package com.example.smartlabelling.presentation.ui.models

import com.example.smartlabelling.domain.models.NutritionDeclaration

data class NutritionDeclarationUI(
    val energy: Int,
    val fats: Int,
    val proteins: Int,
    val sugar: Int,
    val salt: Int,
)

fun NutritionDeclaration.toNutritionDeclarationUI() = NutritionDeclarationUI(
    energy, fats, proteins, sugar, salt
)