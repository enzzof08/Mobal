fun main() {

//    var idade: Int = 27
//    var altura = 1.80
//    val texto = "Bom dia, pessoal"
//    println(texto)
//    println(texto.length)
//    println(texto.uppercase())
//    println(texto.contains("pessoal"))
//    println(idade)
//    texto()


//    val texto = """
//        Texto escrito
//        em várias linhas
//        para teste
//        """
//
//    println(texto)

//    var caracter = 'e'
//    println(caracter)


//    val bloqueado: Boolean = false
//    println(bloqueado)

//    val idade: Int = 25
//    println(idade)
//    val populacao:Long = 7000000000000L
//    println(populacao)

//    val populacao: Long = 7_000_000_000L
//    println(populacao)

//    val peso: Float = 73.123456789F
//    println(peso)

//    val altura: Double = 1.73
//    println(altura)


//    val x : Int = 10
//    val y: Double = x.toDouble()
//    val z: Double = x

//    val result = 10 % 3
//    println(result)

    mandaSalve("joao")
    mandaSalve()

    nota()
    idade()
    quando()

    var nome : String? = "joao"
    nome = null

    var numeros = arrayOf(1, 2, 2)
    println(numeros[0])  // 1
    numeros[1] = 50
    println(numeros[1])  // 50
    println(numeros.first())
    println(numeros.last())

}

fun nota(){
    val nota = 7
    if(nota >= 9){
        println("Excelente")
    }else if(nota >= 6){
        println("Bom")
    }else{
        println("Reprovado")
    }
}

fun idade(){
    val idade = 20
    val status = if(idade >= 18){
        "Maior de idade"
        println("Teste 2")
        println("Teste 3")
    }else{
        "Menor de idade"
    }
    println(status)
}

fun quando(){
    val nota = 9
    when(nota){
        9, 10 -> println("Excelente")
        7, 8 -> println("Bom")
        6 -> println("Regular")
        else -> "Outro dia"
    }
}

fun mandaSalve(nome: String = "mano"){

    println("Salve $nome")

}
