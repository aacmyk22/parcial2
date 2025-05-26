package com.aacm.parcial2.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.navArgument
import androidx.navigation.NavType
import com.aacm.parcial2.ui.screens.ProductListScreen
import com.aacm.parcial2.ui.screens.ProductDetailScreen
import com.aacm.parcial2.ui.screens.CartScreen
import com.aacm.parcial2.viewModel.ProductViewModel


sealed class Screen(val route: String) {
    object ProductList : Screen("product_list")
    object ProductDetail : Screen("product_detail/{productId}") {
        fun createRoute(productId: Int) = "product_detail/$productId"
    }
    object Cart : Screen("cart")
}

@Composable
fun NavGraph(
    navController: NavHostController,
    viewModel: ProductViewModel
) {
    NavHost(
        navController = navController,
        startDestination = Screen.ProductList.route
    ) {

        composable(Screen.ProductList.route) {
            ProductListScreen(
                viewModel = viewModel,
                onProductClick = { product ->
                    navController.navigate(Screen.ProductDetail.createRoute(product.id))
                },
                onCartClick = {
                    navController.navigate(Screen.Cart.route)
                }
            )
        }


        composable(
            route = Screen.ProductDetail.route,
            arguments = listOf(
                navArgument("productId") {
                    type = NavType.IntType
                }
            )
        ) { backStackEntry ->
            val productId = backStackEntry.arguments?.getInt("productId") ?: return@composable
            ProductDetailScreen(
                productId = productId,
                viewModel = viewModel,
                onBackClick = {
                    navController.popBackStack()
                },
                onCartClick = {
                    navController.navigate(Screen.Cart.route)
                }
            )
        }

        // Pantalla del carrito
        composable(Screen.Cart.route) {
            CartScreen(
                viewModel = viewModel,
                onBackClick = {
                    navController.popBackStack()
                }
            )
        }
    }
}




