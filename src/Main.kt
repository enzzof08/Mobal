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

//    mandaSalve("joao")
//    mandaSalve()
//
//    nota()
//    idade()
//    quando()
//
//    var nome : String? = "joao"
//    nome = null
//
//    var numeros = arrayOf(1, 2, 2)
//    println(numeros[0])  // 1
//    numeros[1] = 50
//    println(numeros[1])  // 50
//    println(numeros.first())
//    println(numeros.last())

//    var carros = mutableListOf("Corsa", "Celta")
//    println(carros.size)
//    println(carros.last())
//    println(carros.add("Fusca"))
//    println(carros.last())
//
//    val cores = setOf("Azul", "Verde", "Azul")
//    cores.add("Amarelo") //nao funciona
//    cores.remove("Azul") //nao funciona
//
//    val cores = mutableSetOf("Azul", "Verde", "Azul")
//    cores.add("Amarelo")
//    cores.remove(element = "Azul")


//    val pessoas = mapOf(
//        "Joao" to 25,
//        "Maria" to 26
//    )
//    println(pessoas["Joao"])
//    println(pessoas["Maria"])
//    pessoas["Maria"] = 27 // nao funciona


//    val produtos = mutableMapOf(
//        "pc" to "computador",
//        "cl" to "celular"
//    )
//    println(produtos["pc"])
//    produtos["ms"] = "mouse"
//    produtos.remove(key = "pc")
//    println(produtos)


//    var i = 0
//    while (i < 10){
//        println(i)
//
//        i++
//    }
//
//    1 .. 5  // 1 a 5
//    1 until  5 // 1 a 4
//    5 downTo 1 // 5 a 1
//    1 .. 10 step 2 // 1, 3, 5, 7, 9

//    for (i in 1 .. 5){
//        println(i)
//    }

//    val carros = listOf("corsa", "celta", "fusca")
//    for(carro in carros){
//        println(carro)
//    }


//    val idade = 15
//    when (idade){
//        in 0 .. 12 -> println("Crianca")
//        in 13 .. 17 -> println("Adoslescente")
//        in 18 .. 59 -> println("Adulto")
//        else -> println("Idoso")
//    }


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
