package com.example.matchalatte_uts_project.model

import com.google.gson.annotations.SerializedName

data class Menu(
    val id: String?,
    @SerializedName("menu_name") val menuName: String?,
    @SerializedName("description") val description: String?,
    @SerializedName("price") val price: String?,
    @SerializedName("photo_url") val photoUrl: String?,
)