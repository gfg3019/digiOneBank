package one.digitalinnovation.digioonebank.teste


import one.digitalinnovation.digioonebank.Gerente

fun main(){
    val func = Gerente("Genisson Ferreira", "123546548411", 6500.00, "senha123")
    ImprimeRelatorioFuncionario.imprime(func)
    TesteAutenticacao().autentica(func)
}

