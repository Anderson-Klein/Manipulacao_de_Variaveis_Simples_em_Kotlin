fun main() {

    val nome1: String = "Fulano"
    var idade1: Int = 33
    var altura1: Double = 1.60
    var estudante1: Boolean = true

    val nome2: String = "Beltrano"
    var idade2: Int = 24
    var altura2: Double = 2.00
    var estudante2: Boolean = false


    fun soma(a: Int = idade1, b: Int = idade2): Int {
        return a + b
    }

    fun mutiplicacao(a: Double = altura1): Double {
        return a * 2
    }

    fun saudacao(nome1: String) {
        println("Olá, $nome1!")
    }

    println(saudacao(nome1))
    println("Nome: $nome1")
    println("Idade: $idade1")
    println("Altura: $altura1")
    println("A soma das idades: ${soma()}")
    println("A altura vezes 2: ${mutiplicacao()}")
     
}