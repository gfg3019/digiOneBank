package one.digitalinnovation.digioonebank.teste

import one.digitalinnovation.digioonebank.Banco

fun main(){
    val digiOneBank = Banco(nome ="DigiOne", numero = 12)
    println(digiOneBank.nome)
    println(digiOneBank.numero)

    val banco2 = digiOneBank.copy(nome = "Banco2")

    println(digiOneBank.nome)
    println(digiOneBank.numero)

}