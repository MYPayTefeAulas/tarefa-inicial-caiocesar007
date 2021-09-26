package Greeter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.atividadeskotlin.databinding.ActivityGreeterBinding

class GreeterActivity : AppCompatActivity() {
    private lateinit var binding: ActivityGreeterBinding
    private val ListaNomes = mutableListOf<String>()
    private var indiceAtual = 0 //Indicador de índice
    private var greeterAtual = 1

        override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityGreeterBinding.inflate(layoutInflater)
        //Código de configuração da tela, ou de configuração de variáveis e criação de tipos de greeters diferentes
        val greeter = Greeter (cumprimento = "Olá")// renomear os nomes de greeter Alt+Shift+R ou Shift + F6
        val greeter1 = Greeter (cumprimento = "Bem-vindo")

            ListaNomes.add("Luiz") //Lista de nomes que são Stringers
            ListaNomes.add("Ecson")
            ListaNomes.add("Larissa")
            ListaNomes.add("Erigeyce")

        //Código de configuração dos botôes
        binding.btImprimir.setOnClickListener {
        val nomeAtual = ListaNomes[indiceAtual]
        when (greeterAtual){
            1-> binding.txtSaida.text = greeter.greet(nomeAtual)
            2-> binding.txtSaida.text = greeter1.greet(nomeAtual)
        }

          if (indiceAtual==ListaNomes.size -1) {
                indiceAtual = 0
            }
          else{
                indiceAtual++
            }

            }
            binding.btTrocar.setOnClickListener {
                if(greeterAtual==1){
                  greeterAtual = 2
                  binding.txtNumGreeter.text = "2"
                }else{
                  greeterAtual = 1
                  binding.txtNumGreeter.text = "1"
                }
            }

        setContentView(binding.root)
    }
}