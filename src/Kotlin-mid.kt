fun main() {
    println("===== Arreglos tradicionales =====")

    // arreglo de tipo int
    val numeros: Array<Int> = arrayOf(10, 20, 30, 40, 50)
    val frutas: Array<String> = arrayOf("manzana", "pera", "sandia", "plátano")

    println("Números: ${numeros.contentToString()}")
    println("Primera fruta: ${frutas[0].uppercase()}")
    println("Ultima fruta: ${frutas[frutas.size - 1].lowercase()}")

    // arreglos de longitud fija

    val temperaturas = Array(7) { 20 + it * 2 }
    println("Temperaturas semana: ${temperaturas.contentToString()}")

    println("====== LISTAS INMUTABLES =======")
    // Listas de solo lectura

    val ciudades: List<String> = listOf("Lima", "Arequipa", "Cusco", "Trujillo", "Chiclayo", "Tumbes", "Piura")
    val precios = listOf<Double>(14.56, 21.2, 12.5, 16.5, 16.3, 12.4)

    println("Ciudadades: $ciudades")
    println("Canidad de ciudades: ${ciudades.size}")
    println("Cusco esta en la lista: ${ciudades.contains("Cusco")}")
    println("Inidice tiene la ciudad de Chiclayo ${ciudades.indexOf("Chiclayo")}")

    // acceso seguro a un elementos
    println("Segunda ciudad: ${ciudades.getOrNull(1)}")
    println("Ciudad existente: ${ ciudades.getOrNull(6) ?: "No existe"} ")

    println("====== LISTAS MUTABLES =======")
    var estudiantes: MutableList<String> = mutableListOf("Javier", "Adriana", "Paul", "Caleb" )
    val calificaciones = mutableListOf<Double>(15.4, 15.0, 16.0, 17.4)
    println("Estudiantes iniciales: $estudiantes")

    // Agregando estudiantes
    estudiantes.add("Pedro")
    estudiantes.add("Maria")
    calificaciones.add(12.0)
    calificaciones.add(14.5)

    estudiantes.addAll(listOf("Alonso", "Julio"))
    calificaciones.addAll(listOf(13.4, 19.9))

    println("Estudiantes final: $estudiantes")
    println("Califiaciones: $calificaciones")

    // Elimianr de lista

    estudiantes.remove("Pedro")
    calificaciones.removeAt(2)

    println("Despues remover: $estudiantes")
    println("Calificaciones: $calificaciones")

    println("========== MAPAS (DICCIONARIOS) ==========")

    // Mapa inmutable
    val codigos : Map<String, Int> = mapOf(
        "Lima" to 1,
        "Arequipa" to 54,
        "Cusco" to 84,
        "Trujillo" to 44,
        "Chiclayo" to 55,
        "Tumbes" to 14
    )
    println("Codigos de ciudades: $codigos")
    println("Codigo de Trujillo: ${codigos["Trujillo"]}")
    println("Codigo intexistente: ${codigos["Piura"] ?: "No registrado"}")

    // Mapa mutables
    val inventario = mutableMapOf<String, Int>(
        "Laptos" to 12,
        "Tablets" to 20,
        "Smartphones" to 40
    )
    println("Inventario inicial: $inventario")

    // Modificamos inventario.
    inventario["Laptos"] = 42
    inventario["Monitores"] = 4
    inventario.remove("Tablets")

    println("Inventario final: $inventario")

    println("====== OPERACIONES UTILITARIOS =======")

    val valores = listOf(2,5,61,29,4,5,61,52,51,5,67,8,8,9,43,2)

    println("Lista original: $valores")
    println("Valores pares: ${valores.filter { it % 2 == 0 }}")
    println("Valores multiplicadps x3 ${valores.map { it *3 }}")
    println("Suma total: ${valores.sum()}")
    println("Mayor: ${valores.maxOrNull()}")
    println("Menor: ${valores.minOrNull()}")
    println("Promedio: ${valores.average()}")
}