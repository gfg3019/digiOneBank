package one.digitalinnovation.digioonebank

class Analista(nome:String, cpf:String, salario:Double):Funcionario(nome, cpf, salario) {
    override fun calculoAuxilio(): Double {
        return salario * 0.6
    }
}