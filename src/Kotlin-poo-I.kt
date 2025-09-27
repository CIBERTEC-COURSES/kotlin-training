fun main(){
    val persona1 = Persona("Pedro Juarez",23,  "Docente")
    val persona2 = Persona("Robert Harper",43, "Fisico")
    val persona3 = Persona("Ana Lopez",24, "Diseñadora")

    persona1.presentarse()
    persona2.presentarse()
    persona3.presentarse()

    println("======= MODIFICAR PROPIEDADES =========")
    persona1.edad = 26
    persona1.profesion = "Ingeniero en Materiales"
    println("${persona1.nombre} actualizo su información")
    persona1.presentarse()

    println("======= UTILIZANDO METODOS ===========")
    println("${persona2.nombre} es mayor de edad? -> ${ if (persona2.esMayorEdad()) "Si" else "No"}")
    println("Ańos hasta la jubilación de ${persona3.nombre}: ${persona3.aniosHastaJubilacion()}")





}

class Persona(val nombre:String, var edad:Int, var profesion: String){

    fun presentarse(){
        println("Hola soy $nombre, tengo $edad años y soy $profesion")
    }

    fun esMayorEdad():Boolean{
        return edad > 18
    }

    // Calcular años restantes a jubilarse
    fun aniosHastaJubilacion(): Int{
        val edadJubilacion = 65
        return if (edadJubilacion > edad ){
            edadJubilacion - edad
        }else {
            0
        }

    }

}

class CuentaBancaria(val titular: String, val nroCuenta: String, saldoInicial: Double){
    // propiedad privada o valor interno de la clase
    private var saldo: Double = saldoInicial

    val saldoFormateado: String get() = "S/.${"%.2f".format(saldo)}"

    fun depositar(monto: Double){
        if(monto > 0){
            saldo += monto
            println("Deposito exitoso: +S/.${"%.2f".format(monto)}. Nuevo saldo: $saldoFormateado")
        }else{
            println("Error al depositar: monto debe ser mayor a 0")
        }
    }

    fun retirar(monto: Double){
        when {
            monto <=0  -> println("Error: El monto debe ser mayor a 0")
            monto > saldo -> println("Error: El monto debe ser menor a saldo acutal: $saldoFormateado")
            else -> {
                saldo -= monto
                println("Retiro OK: -S/.${"%.2f".format(monto)}. Nuevo saldo: $saldoFormateado")
            }
        }
    }

    fun obtenerSaldo(): Double = saldo

    fun mostrarInformacion(){
        println("---------- INFO CC --------------")
        println("Titular: $titular")
        println("Nro CC: $nroCuenta")
        println("Saldo: $saldoFormateado")
    }

}

data class Producto(val nombre:String, val precio: Double, val stock: Int){
    fun valorInventario(): Double = precio * stock
    fun estaDisponible(): Boolean = stock > 0
}