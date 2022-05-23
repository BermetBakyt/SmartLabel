package com.example.smartlabelling.data.remote.dto

import com.example.smartlabelling.domain.models.ConsumptionInfo
import com.google.gson.annotations.SerializedName

class ConsumptionInfoDto(
    @SerializedName("restricted_for_pregnant")
    val restrictedForPregnant: Boolean,
    @SerializedName("restricted_for_underage")
    val restrictedForUnderage: Boolean,
    @SerializedName("restricted_for_pregnant")
    val restrictedForDriver: Boolean,
)

fun ConsumptionInfoDto.toConsumptionInfo() = ConsumptionInfo(
    restrictedForDriver,
    restrictedForPregnant,
    restrictedForUnderage
)