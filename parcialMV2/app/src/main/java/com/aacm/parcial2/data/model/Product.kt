package com.aacm.parcial2.data.model


data class Product(
    val id: Int,
    val name: String,
    val category: String,
    val price: Double,
    val description: String,
    val image: String, // URL o resource identifier
    var addedToCart: Boolean = false
)

// Datos dummy hardcodeados
object ProductData {
    val products = listOf(
        Product(
            id = 1,
            name = "iPhone 16",
            category = "Electrónicos",
            price = 600.99,
            description = "El último iPhone con chip A17 Pro, cámara de 48MP y pantalla Super Retina XDR de 6.1 pulgadas.",
            image = "https://siman.vtexassets.com/arquivos/ids/6691117/104747182_1.jpg?v=638773967994800000"
        ),
        Product(
            id = 2,
            name = "Samsung Galaxy S24",
            category = "Electrónicos",
            price = 500.99,
            description = "Smartphone Android con pantalla Dynamic AMOLED, cámara de 50MP y procesador Snapdragon 8 Gen 3.",
            image = "https://www.almacenestropigas.com.sv/media/catalog/product/4/6/468144000018_8.jpg?optimize=medium&bg-color=255,255,255&fit=bounds&height=1000&width=1000&canvas=1000:1000"
        ),
        Product(
            id = 3,
            name = "Nike Jordan low 1",
            category = "Calzado",
            price = 150.00,
            description = "tenis deportivos con amortiguación Air y diseño moderno para uso diario.",
            image = "https://topshopsv.com/cdn/shop/files/ShopifySquare-PhotoRoom_5.png?v=1694627016"
        ),
        Product(
            id = 4,
            name = "MacBook Pro M1",
            category = "Electrónicos",
            price = 1300.00,
            description = "Laptop profesional con chip M1, pantalla Liquid Retina XDR de 13 pulgadas y hasta 24 horas de batería.",
            image = "https://www.zdnet.com/a/img/2020/11/16/37e33024-2892-4bb7-9d21-6ac6f7544def/apple-macbook-pro-m1-2020-5.jpg"
        ),
        Product(
            id = 5,
            name = "Adidas samba",
            category = "Calzado",
            price = 180.00,
            description = "Zapatillas comodas con tecnología Boost y upper Primeknit para máximo confort.",
            image = "https://originalselsalvador.com/wp-content/uploads/2025/01/Samba_XLG_Shoes_White_IE1377_04_standard.png"
        ),
        Product(
            id = 6,
            name = "camisa pyscho bunny",
            category = "Ropa",
            price = 90.00,
            description = "camisa especial, fabricados con tela de alta calidad y ajuste tradicional.",
            image = "https://saleoutpe.com/cdn/shop/files/image_1200x1496_e9e21db3-d4ce-4207-92d9-ea49f3571386.webp?v=1723597984"
        ),
        Product(
            id = 7,
            name = "Bocina JBL",
            category = "Electrónicos",
            price = 399.99,
            description = "Bocina especial con cancelación de ruido líder en la industria y 30 horas de batería.",
            image = "https://www.officedepot.com.sv/medias/37440-2.jpg-1200ftw?context=bWFzdGVyfHJvb3R8MzI4OTYxfGltYWdlL2pwZWd8YURsakwyZ3hOeTh4TVRrek5UYzBNREV3TURZek9DOHpOelEwTUMweUxtcHdaMTh4TWpBd1puUjN8NTRiMTdkMjViOTI4OTRkNGFiYmI5MDVkMTFhN2Y3MzdkMWI1MzJmZjY5MGMzMDlkZTIxM2I5ZmFiMjIzYTBhMg"
        ),
        Product(
            id = 8,
            name = "camisa polo",
            category = "Ropa",
            price = 299.99,
            description = "Camisa moderna, perfecta para actividades al aire libre y clima adverso.",
            image = "https://www.luholife.com/wp-content/uploads/2023/09/710666998003-001.png"
        ),
        Product(
            id = 9,
            name = "PlayStation 5",
            category = "Electrónicos",
            price = 499.99,
            description = "Consola de videojuegos de nueva generación con gráficos 4K, SSD ultrarrápido y audio 3D.",
            image = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcROOq42zVf_93ekFfVntkWuLhuDcXKtk8TRog&s"
        ),
        Product(
            id = 10,
            name = "Air force one",
            category = "Calzado",
            price = 65.00,
            description = "tenias clásicas, un ícono de temporada del street.",
            image = "https://modaurbanasv.com/cdn/shop/products/b7d9211c-26e7-431a-ac24-b0540fb3c00f_fadf9369-9d0f-4074-a6a9-8112978909fa.webp?v=1690824253&width=1946"
        )
    )
}