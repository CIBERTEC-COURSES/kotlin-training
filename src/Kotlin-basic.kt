/**
 * You can edit, run, and share this code.
 * play.kotlinlang.org
 */

fun main() {
    println("------ TIPOS DE DATOS Y VARIABELS ------")

    // VARIABLES INMUTABLES  (val) - "CONSTANTES"
    val nombre:String = "Juan Perez"
    val edad: Int = 24
    val salario: Double = 4214.50
    val esColaborador : Boolean = false
    val inicial : Char = 'J'

    println("Nombre: $nombre")
    println("Edad: $edad años")
    println("Salario: S/. $salario")
    println("Estado: ${ if(esColaborador) "Activo" else "Inactivo" }")
    println("Inicial: $inicial")

    println("================================")

    // VARIABLES MUTABLE (var) - Variable
    // VALORES INICIALES
    var contador: Int = 0
    var mensaje: String = "Iniciando carga...."
    var temperatura : Float = 17.5f

    println("Contador inicial: $contador")
    println("Mensaje: $mensaje")
    println("Temperatura: ${temperatura} °C")
    // VALORES MODIFICADOS
    contador += 3
    mensaje = "Mostrando elementos..."
    temperatura = 14.2f
    println("*********************************")
    println("Contador: $contador")
    println("Mensaje: $mensaje")
    println("Temperatura: ${temperatura} °C")
    println("================================")

    // Deduccion de tipos de datos
    val ciudad = "Trujillo" // String 
    val poblacion = 1_067_700 // Int (nota separador)
    val coordenada = -8.1158 // Double
    val activa = true // Boolean

    println("Ciudad: $ciudad")
    println("Pobalción ${String.format("%,d", poblacion)} habitantes")
    println("Latitud: $coordenada")
    println("Ciudad esta activa? $activa")
    println("================================")
    // NULLABLE - null safety

    var apellido: String? = null
    var telefono: String? = "987654321"

    println("Apellido: ${apellido ?: "No esta especficado"}")
    println("Telefono: ${telefono ?: "No esta registrado"}")

    // Safe call operator
    println("Logintud del telefono: ${telefono?.length}")
    println("Logintud del apellido: ${apellido?.length}")




}
