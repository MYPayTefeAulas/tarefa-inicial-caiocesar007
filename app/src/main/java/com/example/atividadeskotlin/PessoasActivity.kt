package com.example.atividadeskotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.atividadeskotlin.databinding.ActivityPessoasBinding

class PessoasActivity : AppCompatActivity() {
    private lateinit var binding: ActivityPessoasBinding

    private var nome = ""
    private var idade = 0
    private val ListaPessoas = mutableListOf<Pessoa1>()

    class Pessoa1(val nome: String, val idade: Int){

    }

    private var indiceatual = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityPessoasBinding.inflate(layoutInflater)

        binding.btimprimir.setOnClickListener {
            binding.txtSaida.text= ImprimiPessoa()
        }
        binding.btSalvar.setOnClickListener {
        nome = binding.txtNome.text.toString()
        binding.txtNome.text.clear()//linha de comando para limpar o campo quando clico em salvar
        idade = binding.txtIdade.text.toString().toInt()
        binding.txtIdade.text.clear()//linha de comando para limpar o campo quando clico em salvar

         val pessoa = Pessoa1(nome, idade)
         ListaPessoas.add(pessoa)
        }

        setContentView(binding.root)
    }
    fun ImprimiPessoa(): String{
        if(indiceatual >= ListaPessoas.size)
            indiceatual = 0
        val pessoaAtual = ListaPessoas[indiceatual]
        indiceatual++
        return "Nome: ${pessoaAtual.nome}. Idade: ${pessoaAtual.idade}"
    }
}