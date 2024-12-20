package com.example.gameapp.domain

import com.example.gameapp.domain.items.SpecificGameItem
import com.example.gameapp.repo.GameRepository
import javax.inject.Inject

class GetGameByIdUseCase @Inject constructor(private val gameRepository: GameRepository){
    /*
    The "Suspend" keyword indicates that this fn can execute asynchronously
     (independent of the main thread) using coroutines
     */
    suspend operator fun invoke(id: Int): SpecificGameItem {
        return  gameRepository.getGameById(id)
    }
}