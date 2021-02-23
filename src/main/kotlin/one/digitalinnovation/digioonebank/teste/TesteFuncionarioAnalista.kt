package one.digitalinnovation.digioonebank.teste

import one.digitalinnovation.digioonebank.Analista

fun main(){
    val func = Analista("Genisson Ferreira", "123546548411", 2500.00)
    ImprimeRelatorioFuncionario.imprime(func)
}

