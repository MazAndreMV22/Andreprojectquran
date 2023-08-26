package com.example.andreprojectquran.model.nearby

import com.google.gson.annotations.SerializedName
import com.example.andreprojectquran.model.nearby.ModelLocation

class ModelGeometry {
    @SerializedName("location")
    lateinit var modelLocation: ModelLocation
}