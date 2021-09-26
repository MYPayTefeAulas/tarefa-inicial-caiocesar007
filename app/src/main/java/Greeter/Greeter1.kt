package Greeter

//Greeter1 = Greetertipo2 da aula de programação
class Greeter1 {
    val cumprimento: String

    constructor(cumprimento: String){
        this.cumprimento=cumprimento
    }
    fun greet (nome: String): String {
        val cumprimentoCompleto = "$cumprimento $nome"
        return cumprimentoCompleto
    }
}