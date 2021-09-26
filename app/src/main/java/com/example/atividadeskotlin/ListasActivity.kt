package com.example.atividadeskotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import com.example.atividadeskotlin.databinding.ActivityCalculadoraBinding
import com.example.atividadeskotlin.databinding.ActivityListasBinding

class ListasActivity : AppCompatActivity() {
    private lateinit var binding:ActivityListasBinding

    private val Listafrutas = listOf("maçã", "mamão", "abacate")
    private val Listavegetais = listOf("pepino","alface","pimentão")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityListasBinding.inflate(layoutInflater)

        binding.btAnalisar.setOnClickListener {
    //      binding.txtSaida1.text = analisar(binding.txtEntrada.text.toString())
            binding.txtSaida1.text = analisar1(binding.txtEntrada.text.toString())
        }


        setContentView(binding.root)
    }
// Abaixo está uma função mostrando uma forma de realizar
    fun analisar(entrada:String):String{
        var saida = ""
        for (fruta in Listafrutas){
            fruta==entrada
            saida="É uma fruta"
            break
        }
        return saida
    }
    // Abaixo está outra forma de função mostrando uma forma de realizar
    fun analisar1(entrada:String):String{
        var saida = ""

        for (fruta in Listafrutas) {
            if (fruta == entrada){
                saida = "É uma fruta"
        }
            break
        }

        for (vegetais in Listavegetais) {
            if (vegetais == entrada){
                saida = "É uma vegetal"
            }
            break
        }
        //If abaixoPercorre as duas listas e analisa se está incluído ou não. Caso não esteja envia a msg abaixo
        if (saida==""){
            saida="Não sei o que é isso!"
        }

        return saida
    }

}