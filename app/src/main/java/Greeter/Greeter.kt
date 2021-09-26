package Greeter

class Greeter(val cumprimento: String) {
    fun greet(nome: String):String{
        val cumprimentoCompleto="$cumprimento $nome"
        return cumprimentoCompleto
    }
}