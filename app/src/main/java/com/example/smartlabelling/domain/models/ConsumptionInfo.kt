package com.example.smartlabelling.domain.models

import com.example.smartlabelling.presentation.ui.models.ConsumptionInfoUI
import com.google.gson.annotations.SerializedName

class ConsumptionInfo(
    val restrictedForPregnant: Boolean,
    val restrictedForUnderage: Boolean,
    val restrictedForDriver: Boolean,
)

fun ConsumptionInfo.toConsumptionInfoUI() = ConsumptionInfoUI(
    restrictedForPregnant,
    restrictedForUnderage,
    restrictedForDriver
)