
import com.example.data.remote.dto.ConsumptionInfoDto
import com.example.data.remote.dto.NutritionDeclarationDto
import com.example.data.remote.dto.toConsumptionInfo
import com.example.data.remote.dto.toNutritionDeclaration
import com.example.domain.models.Product
import com.google.gson.annotations.SerializedName

class ProductDto(
    @SerializedName("id")
    val id: Int,
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
    @SerializedName("product_image")
    val productImage:String,
)

fun ProductDto.toProduct() = Product(
    id,
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
    productImage
)