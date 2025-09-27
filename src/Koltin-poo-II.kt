fun main(){
    println("------ HERENCIA ------")
    val empleado = Empleado("Luis Garcia", 30, "EMP001", 3000.00)
    val gerente = Gerente("Ana Ruiz", 40, "GER001", 8004.00, "Ventas", 2000.00)
    val desarrollador = Desarrollador("Carlos Mareategui", 28, "DEV001", 5300.0, "Kotlin", "Semi-Senior")
    println("====== INFORMACION BASICA =====")
    empleado.mostrarInformacion()
    gerente.mostrarInformacion()
    desarrollador.mostrarInformacion()

    println("=========== CALCULO DE SALARIO ==========")
    println("Salario empleado: S/.${"%.2f".format(empleado.calcularSalario())}")
    println("Salario gerente: S/.${"%.2f".format(gerente.calcularSalario())}")
    println("Salario desarrollador: S/. ${"%.2f".format(desarrollador.calcularSalario())}")

}

open class  Empleado(
    val nombre: String,
    val edad: Int,
    val codigo: String,
    protected val salarioBase: Double
){
    open fun calcularSalario(): Double = salarioBase

    fun mostrarInformacion(){
        println("====== EMPLEADO ========")
        println("nombre: $nombre")
        println("edad: $edad")
        println("codigo: $codigo")
    }

}

class Gerente(
    nombre: String,
    edad: Int,
    codigo: String,
    salarioBase: Double,
    val departamento: String,
    private val bonoGerencial: Double
): Empleado(nombre, edad, codigo, salarioBase){
    override fun calcularSalario(): Double{
        return bonoGerencial + salarioBase
    }

    fun dirigirReunion(){
        println("$nombre esta dirigiendo una reunion")
    }
}

class Desarrollador(
    nombre: String,
    edad: Int,
    codigo: String,
    salarioBase: Double,
    val lenguajePrincial: String,
    val nivel: String
): Empleado(nombre, edad, codigo, salarioBase){
    override fun calcularSalario(): Double{
        val multiplicador = when(nivel) {
            "Junior" -> 1.0
            "Semi-Senior" -> 1.3
            "Senior" -> 1.6
            else -> 1.0

        }
        return multiplicador * salarioBase
    }

    fun programar(){
        println("$nombre desarrolla en el lenguaje $lenguajePrincial (nivel: $nivel)")
    }

    fun revisarCodigo(){
        println("$nombre esta revisado en codigo como desarrollador (nivel: $nivel)")
    }

}