package com.example.smartlabelling.presentation.presentation.models

import com.example.domain.models.ConsumptionInfo

class ConsumptionInfoUI(
    val restrictedForPregnant: Boolean,
    val restrictedForUnderage: Boolean,
    val restrictedForDriver: Boolean,
)

fun ConsumptionInfo.toConsumptionInfoUI() = ConsumptionInfoUI(
    restrictedForPregnant,
    restrictedForUnderage,
    restrictedForDriver
)