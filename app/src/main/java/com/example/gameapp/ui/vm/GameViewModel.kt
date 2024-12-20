package com.example.gameapp.ui.vm

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.gameapp.domain.GetGameByIdUseCase
import com.example.gameapp.domain.GetGameUseCase
import com.example.gameapp.domain.items.GameItem
import com.example.gameapp.domain.items.SpecificGameItem
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class GameViewModel @Inject constructor(
    private val getGamesUseCase: GetGameUseCase,
    private val getGameByIdUseCase: GetGameByIdUseCase
): ViewModel() {
    /*
    How Kotlin coroutines and liveData can be used
    together to implement asynchronous data fetching and stateManagement in ViewModel

    The below code converts PRIVATE MUTABLE  live data _games to  PUBLIC IMMUTABLE live data games
    of same type and sets its value to _games. get() fn gets the current value of games.
    This Design pattern is commonly used in Android development  to ensure that the state of a view model
    can only be modified from within the view-model itself
     */
    private val _games = MutableLiveData<List<GameItem>>()
    val games: LiveData<List<GameItem>> get() = _games

    private val _game = MutableLiveData<SpecificGameItem>()
    val game: LiveData<SpecificGameItem> get() = _game

    init {
        getGames()
    }

    //Use kotlin coroutines to asynchronously fetch data from a remote datasource
    // and update state viewModel
    private fun getGames() {
        //launch new coroutine in viewmodelScope
        viewModelScope.launch {

            try {
                //fetch list of games from a remote data source
                val games = getGamesUseCase()
                _games.value = games

            } catch (_: Exception) {}   //if exception occurs caught using catch

        }

    }

    fun getGameById(id: Int) {
        //Coroutine is a lightweight thread that can suspend its execution
        //uses ViewModelScope.launch to launch a coroutine
        viewModelScope.launch {

            try {

                val game = getGameByIdUseCase(id)
                _game.value = game

            } catch (_: Exception) {}

        }

    }

}
