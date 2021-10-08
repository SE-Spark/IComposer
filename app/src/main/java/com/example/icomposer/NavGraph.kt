package com.example.icomposer

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

@Composable
fun SetupNavGraph(
    navController: NavHostController
){
NavHost(
    navController= navController,
    startDestination = Screen.Home.route
){
    composable(
        route = Screen.Home.route
    ){
        HomeScreen(navController = rememberNavController())
    }
    composable(
        route = Screen.Detail.route
    ){
        DetailScreen(navController = rememberNavController())
    }
}
}