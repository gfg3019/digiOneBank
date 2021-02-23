package one.digitalinnovation.digioonebank.teste

import one.digitalinnovation.digioonebank.Cliente
import one.digitalinnovation.digioonebank.ClienteTipo

fun main(){
    val cliente = Cliente(
        nome = "João Birobiro",
        cpf = "123.123.123.55",
        clienteTipo = ClienteTipo.PF,
        senha = "456456"
    )
    println(cliente)
    TesteAutenticacao().autentica(cliente)
}