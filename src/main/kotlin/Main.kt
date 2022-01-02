fun main() {
    println("Bem vindo ao Byte Bank!")

    for (id in 5 downTo 1 step 2) {
        val titular = "Carleane Rodrigues dos Santos ID:$id"
        val numeroConta = 1500 + id
        var saldoConta = 0.0

        println("Titular $titular")
        println("Número da conta $numeroConta")
        println("Saldo R$$saldoConta")
        testaCondicoes(saldoConta)
        println()
    }
}

fun testaCondicoes(saldoConta: Double) {

// ** alternativa para o when

//        if (saldoConta > 0.0){
//        println("Conta é positiva")
//    } else if (saldoConta == 0.0){
//        println("Conta é neutra")
//    } else {
//        println("Conta é negativa")
//    }

    when {
        saldoConta > 0.0 -> println("Conta é positiva")
        saldoConta == 0.0 -> println("Conta é neutra")
        else -> println("Conta é negativa")
    }
}