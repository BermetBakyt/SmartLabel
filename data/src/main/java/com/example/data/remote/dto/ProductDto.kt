package com.example.data.remote.dto
import com.example.domain.models.Product
import com.google.gson.annotations.SerializedName

data class ProductDto(
    @SerializedName("objectId")
    val objectId: String,
    @SerializedName("product_name")
    val productName: String,
    @SerializedName("production_date")
    val productionDate: String,
    @SerializedName("expiry_date")
    val expiryDate: String,
    @SerializedName("manifacturer_country")
    val manifacturerCountry: String,
    @SerializedName("ingredients")
    val ingredients: List<String>,
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

fun ProductDto.toProduct() = Product(
    objectId,
    productName,
    productionDate,
    expiryDate,
    manifacturerCountry,
    ingredients,
    category,
    packagingSize,
    seriesNumber,
    nutritionDeclarationDto.toNutritionDeclaration(),
    consumptionInfo.toConsumptionInfo(),
)