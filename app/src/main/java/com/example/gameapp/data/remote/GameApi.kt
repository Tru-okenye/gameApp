package com.example.gameapp.data.remote

import com.example.gameapp.data.remote.models.GameModel
import com.example.gameapp.data.remote.models.SpecificGameModel
import com.example.gameapp.util.Constants.Companion.GAMES_ENDPOINT
import com.example.gameapp.util.Constants.Companion.GAME_ID_ENDPOINT
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

/*
Type of Declaration that defines a set of
methods and properties that a class can implement
i.e a contract/set of requirements that a class must adhere to
 */
interface GameApi {
    //retrofit2.http GET
    @GET(GAMES_ENDPOINT)
    suspend fun getGames():Response<List<GameModel>>  //Coroutine call to a suspend function for network Request

    @GET(GAME_ID_ENDPOINT)
    suspend fun getGameById(@Query(value = "id") id: Int):Response<SpecificGameModel>


}