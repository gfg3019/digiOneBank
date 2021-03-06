package one.digitalinnovation.digioonebank

class Cliente(
    nome: String,
    cpf: String,
    val clienteTipo: ClienteTipo,
    val senha: String):
    Pessoa(nome, cpf), Logavel {
    override fun login(): Boolean = "123546" == senha
    override fun toString(): String = """
        Nome: $nome,
        cpf: $cpf,
        tipo: ${clienteTipo.descricao}
    """.trimIndent()
}