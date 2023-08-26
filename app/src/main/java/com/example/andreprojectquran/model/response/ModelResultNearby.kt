package com.example.andreprojectquran.model.response

import com.google.gson.annotations.SerializedName
import com.example.andreprojectquran.model.nearby.ModelResults

class ModelResultNearby {
    @SerializedName("results")
    lateinit var modelResults: List<ModelResults>
}