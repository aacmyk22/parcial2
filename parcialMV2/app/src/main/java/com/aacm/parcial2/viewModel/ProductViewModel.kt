package com.aacm.parcial2.viewModel

import androidx.lifecycle.ViewModel
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.State
import androidx.compose.runtime.derivedStateOf
import com.aacm.parcial2.data.model.Product
import com.aacm.parcial2.data.model.ProductData

class ProductViewModel : ViewModel() {

    // Lista de productos original
    private val _products = mutableStateOf(ProductData.products.toMutableList())
    val products: State<List<Product>> = _products

    // Término de búsqueda
    private val _searchQuery = mutableStateOf("")
    val searchQuery: State<String> = _searchQuery

    // Producto seleccionado para mostrar en detalle
    private val _selectedProduct = mutableStateOf<Product?>(null)
    val selectedProduct: State<Product?> = _selectedProduct

    // Lista filtrada de productos basada en la búsqueda
    val filteredProducts: State<List<Product>> = derivedStateOf {
        if (_searchQuery.value.isBlank()) {
            _products.value
        } else {
            _products.value.filter { product ->
                product.name.contains(_searchQuery.value, ignoreCase = true) ||
                        product.category.contains(_searchQuery.value, ignoreCase = true)
            }
        }
    }

    // Lista de productos en el carrito
    val cartProducts: State<List<Product>> = derivedStateOf {
        _products.value.filter { it.addedToCart }
    }

    // Actualizar término de búsqueda
    fun updateSearchQuery(query: String) {
        _searchQuery.value = query
    }

    // Seleccionar producto para mostrar detalle
    fun selectProduct(product: Product) {
        _selectedProduct.value = product
    }

    // Limpiar producto seleccionado
    fun clearSelectedProduct() {
        _selectedProduct.value = null
    }

    // Agregar/quitar producto del carrito
    fun toggleProductInCart(productId: Int) {
        val updatedProducts = _products.value.map { product ->
            if (product.id == productId) {
                product.copy(addedToCart = !product.addedToCart)
            } else {
                product
            }
        }.toMutableList()

        _products.value = updatedProducts

        // Actualizar el producto seleccionado si coincide
        _selectedProduct.value?.let { selected ->
            if (selected.id == productId) {
                _selectedProduct.value = updatedProducts.find { it.id == productId }
            }
        }
    }

    // Obtener un producto por ID
    fun getProductById(id: Int): Product? {
        return _products.value.find { it.id == id }
    }

    // Limpiar búsqueda
    fun clearSearch() {
        _searchQuery.value = ""
    }
}