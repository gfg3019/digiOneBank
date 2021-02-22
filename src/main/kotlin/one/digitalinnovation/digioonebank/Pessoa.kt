package one.digitalinnovation.digioonebank

class Pessoa {
    var nome:String = "Genisson"
    var cpf:String = "114.123.456.55"
    private set

    constructor()

    fun pessoaInfo() = println("$nome $cpf")
}
fun main(){
    val pessoa = Pessoa()
    println(pessoa.nome)
    println(pessoa.cpf)
}
