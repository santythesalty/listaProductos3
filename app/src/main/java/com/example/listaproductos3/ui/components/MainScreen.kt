package com.example.listaproductos3.ui.components

import androidx.compose.runtime.Composable
import com.example.listaproductos3.models.Product

@Composable
fun MainScreen() {
    val sampleProducts = listOf(
        Product("Zapatos Deportivos", "$59.99", "https://prd.place/400"),
        Product("Camiseta Blanca", "$19.99", "https://prd.place/400"),
        Product("Pantalón Jeans", "$39.99", "https://prd.place/400"),
        Product("Zapatos Deportivos", "$59.99", "https://prd.place/400"),
        Product("Camiseta Blanca", "$19.99", "https://prd.place/400"),
        Product("Zapatos Deportivos", "$59.99", "https://prd.place/400"),
        Product("Camiseta Blanca", "$19.99", "https://prd.place/400"),
        Product("Zapatos Deportivos", "$59.99", "https://prd.place/400"),
        Product("Camiseta Blanca", "$19.99", "https://prd.place/400"),
        Product("Zapatos Deportivos", "$59.99", "https://prd.place/400"),
        Product("Camiseta Blanca", "$19.99", "https://prd.place/400"),
        Product("Zapatos Deportivos", "$59.99", "https://prd.place/400"),
        Product("Camiseta Blanca", "$19.99", "https://prd.place/400"),
        Product("Zapatos Deportivos", "$59.99", "https://prd.place/400"),
        Product("Camiseta Blanca", "$19.99", "https://prd.place/400")

    )

    ProductListScreen(products = sampleProducts)
}
