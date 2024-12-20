package com.example.gameapp.domain.items

import com.example.gameapp.data.remote.models.GameModel

data class GameItem(
    val id: Int,
    val title: String,
    val thumbnail: String,
    val short_description: String
)

/*
extension function that extends the GameModel class
to a new method called toGameItem()
By creating this extension function, any GameModel object can now call the toGameItem()
to convert itself to GameItem object without having to write a separate converter function
 */
fun GameModel.toGameItem() = GameItem(id, title, thumbnail, short_description)
