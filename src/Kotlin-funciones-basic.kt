import java.time.LocalDate
import java.time.LocalDateTime

fun main (){
    println("===== FUNCIONES BASICAS =====")
    saludar()
    mostrarFecha()
    println("===== FUNCIONES CON PARAMETROS =====")
    saludarPersona("Luis")
    saludarPersona("Carlos Lazaro")
    presentarPersona("Martin Perez", 23, "Administrador")
    presentarPersona("Sara Connor", 33, "Ingenrio Ind.")
    println("===== FUNCIONES CON RETORNO DE VALORES =====")
    val suma = sumar(13,5)
    val producto = multiplicar(3,4)
    val promedio = calcularPromedio(15.2,15.6, 14.5)

    println("Suma: $suma")
    println("Multiplicacion: $producto")
    println("Promedio: $promedio")
    println("===== FUNCIONES CON PARAMETROS POR DEFAULT =====")
    val areaR1 = calcularAreaRectangulo(10.0,5.0)
    val areaR2 = calcularAreaRectangulo(3.0)
    val areaR3 = calcularAreaRectangulo()

    println("Area1: $areaR1")
    println("Area2: $areaR2")
    println("Area3: $areaR3")
    println("===== FUNCIONES CON PARAMETROS NOMBRADOS =====")
    println("Interes simple: ${ "%.2f".format(calcularInteres(capital = 1020.23, tasa= 0.15, tiempo = 2)) }")
}

fun saludar(){
    println("Saludando...")
}
fun mostrarFecha(){
    println("Hoy es ${LocalDateTime.now()}")
}

fun saludarPersona(nombre: String){
    println("Hola $nombre")
}
fun presentarPersona(nombre: String, edad: Int, profesion:String){
    println("Nombre: $nombre, Edad: $edad, Profesión: $profesion")
}
fun sumar(a: Int, b: Int): Int {
    return a + b
}
fun multiplicar(a: Int, b: Int): Int = a * b

fun calcularPromedio(notaT1: Double, notaT2: Double, notaT3: Double): Double {
    return (notaT1 + notaT2 + notaT3 )/3
}

fun calcularAreaRectangulo(base: Double = 4.0, altura: Double= 2.5): Double {
    return base * altura
}

fun calcularInteres(capital: Double, tasa:Double, tiempo:Int): Double {
    return capital * tasa * tiempo
}