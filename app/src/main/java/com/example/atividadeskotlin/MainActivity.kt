package com.example.atividadeskotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.atividadeskotlin.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
//Código irá entrar aqui
        binding.btTrocar.setOnClickListener {
    //        binding.txtHello.text = novoTexto()//quando clicar no botão, ocorre uma troca para o novo texto
//            binding.txtHello.text = textoDaEntrada()
        }

        setContentView(binding.root)
    }
// A função NovoTexto é chamada durante o click no botão. Assim quando eu clico no botão, retorna para a string abaixo

    fun novoTexto(): String {
        return "Meu Nome é Caio César"
    }
//    fun textoDaEntrada(): String {
//        return binding.txtEntrada.text.toString()
//    }
}