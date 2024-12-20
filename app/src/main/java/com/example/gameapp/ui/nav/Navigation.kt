package com.example.gameapp.ui.nav

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.gameapp.ui.screens.DetailScreen
import com.example.gameapp.ui.screens.HomeScreen
import com.example.gameapp.ui.vm.GameViewModel
import com.example.gameapp.util.Constants.Companion.KEY_GAME_ID
import com.example.gameapp.util.Constants.Screens.DETAIL_SCREEN
import com.example.gameapp.util.Constants.Screens.HOME_SCREEN

sealed class Screens (val route: String) {
    object  Home: Screens(route = HOME_SCREEN)
    object  Details: Screens(route = DETAIL_SCREEN)
}

//Setting up NavHost
@Composable
fun SetupNavHost(navController: NavHostController, gameViewModel: GameViewModel) {

    NavHost(navController = navController, startDestination = Screens.Home.route) {

        composable(route = Screens.Home.route) {
            HomeScreen(gameViewModel = gameViewModel, navController = navController)
        }

        composable(route = Screens.Details.route + "/{$KEY_GAME_ID}") { backStackEntry ->
            DetailScreen(id = backStackEntry.arguments?.getString(KEY_GAME_ID)?: "1", gameViewModel = gameViewModel, navController = navController)
        }

    }

}