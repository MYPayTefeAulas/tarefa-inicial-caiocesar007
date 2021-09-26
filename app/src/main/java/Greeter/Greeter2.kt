package Greeter

//Greeter2 = Greetertipo3 da aula de programação
class Greeter2 (cumprimento:String){
    val cumprimento = cumprimento

    fun greet(nome:String): String{
        val cumprimentoCompleto = "$cumprimento $nome"
        return cumprimentoCompleto
    }
}