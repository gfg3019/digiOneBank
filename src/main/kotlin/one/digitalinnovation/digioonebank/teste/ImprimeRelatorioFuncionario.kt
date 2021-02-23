package one.digitalinnovation.digioonebank.teste

import one.digitalinnovation.digioonebank.Funcionario

class ImprimeRelatorioFuncionario {
    companion object{
        fun imprime(funcionario: Funcionario){
            println(funcionario.toString())
        }
    }
}