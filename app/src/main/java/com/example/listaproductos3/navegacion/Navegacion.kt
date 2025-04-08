package com.example.listaproductos3.navegacion

import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalContext
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.listaproductos3.models.Product
import com.example.listaproductos3.ui.components.LoginScreen
import com.example.listaproductos3.ui.screens.ProductListScreen

@Composable
fun Navegacion() {
    val navController = rememberNavController()
    val context = LocalContext.current

    val productosEjemplo = listOf(
        Product("Camiseta", "$19.99", "https://via.placeholder.com/150"),
        Product("Pantalón", "$29.99", "https://via.placeholder.com/150"),
        Product("Zapatillas", "$59.99", "https://via.placeholder.com/150")
    )

    NavHost(navController = navController, startDestination = Login) {
        composable<Login> {
            LoginScreen(
                onLoginClick = {
                    navController.navigate(ListaProductos) {
                        popUpTo(Login) { inclusive = true }
                    }
                }
            )
        }

        composable<ListaProductos> {
            ProductListScreen(
                products = productosEjemplo,
                onLogoutClick = {
                    navController.navigate(Login) {
                        popUpTo(ListaProductos) { inclusive = true }
                    }
                }
            )
        }
    }
}
