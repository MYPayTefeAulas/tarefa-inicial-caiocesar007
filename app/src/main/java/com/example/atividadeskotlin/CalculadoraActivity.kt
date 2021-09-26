package com.example.atividadeskotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.atividadeskotlin.databinding.ActivityCalculadoraBinding
import com.example.atividadeskotlin.databinding.ActivityMainBinding

class CalculadoraActivity : AppCompatActivity() {
    private lateinit var binding: ActivityCalculadoraBinding//chamando o arquivo

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityCalculadoraBinding.inflate(layoutInflater)

        binding.btCalcular.setOnClickListener {
//          binding.txtHello.text = novoTexto()//quando clicar no botão, ocorre uma troca para o novo texto
//          binding.txtSaida.text = calcularDobro()
//          binding.txtSaida.text = multiplicar()
//          binding.txtSaida.text = calcular()
            binding.txtSaida.text = calcularwhen()
        }

        setContentView(binding.root)
    }

    fun novoTexto(): String {
        return "Meu Nome é Caio César"
    }
    fun textoDaEntrada(): String {
        return binding.txtNumero2.text.toString()
    }
    fun calcularDobro(): String {
        val numeroStr = binding.txtNumero2.text.toString()
        val numero = numeroStr.toInt()
        val numeroDobro = numero*2
        return numeroDobro.toString()
    }
    fun multiplicar(): String {
        val numero1 = binding.txtNumero1 .text.toString().toInt()
        val numero2 = binding.txtNumero2 .text.toString().toInt()
        val resultado = numero1 * numero2
        return resultado.toString()
    }
    fun calcular(): String {
        val operação = binding.txtOperacao.text.toString()
        val numero1 = binding.txtNumero1 .text.toString().toInt()
        val numero2 = binding.txtNumero2 .text.toString().toInt() // val para o valor permanecer fixo
        var resultado = 0// usamos var para que o resultado permita alteração
        if (operação== "+"){
            resultado = numero1 + numero2
            return resultado.toString()
        } else if (operação =="-"){
            resultado = numero1 - numero2
        }else if (operação =="*"){
            resultado = numero1*numero2}
        else if (operação =="/"){
            resultado = numero1/numero2}

        return resultado.toString()
    }
    fun calcularwhen(): String {
        val operação = binding.txtOperacao.text.toString()
        val numero1 = binding.txtNumero1 .text.toString().toInt()
        val numero2 = binding.txtNumero2 .text.toString().toInt()
        var resultadoStr = ""
        when (operação) {
            "+" -> resultadoStr = (numero1 + numero2).toString()
            "-" -> resultadoStr = (numero1 - numero2).toString()
            "*" -> resultadoStr = (numero1 * numero2).toString()
            "/" -> resultadoStr = (numero1 / numero2).toString()
             }
            return resultadoStr.toString()
    }
}