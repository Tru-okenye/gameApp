package com.example.gameapp.domain.items

import com.example.gameapp.data.remote.models.GameModel
import com.example.gameapp.data.remote.models.SpecificGameModel

data class SpecificGameItem(
    val id: Int,
    val title: String,
    val thumbnail: String,
    val description: String
)

/*
extension function that extends the SpecificGameModel class
to a new method called toSpecificGameItem()
By creating this extension function, any SpecificGameModel object can now call the toSpecificGameItem()
to convert itself to SpecificGameItem object without having to write a separate converter function
 */
fun SpecificGameModel.toSpecificGameItem() = SpecificGameItem(id, title, thumbnail, description)
