package br.com.ocean_a3_03_07_2019

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        //definindo o conteudo da tela
        setContentView(R.layout.activity_main)


        btHello.setOnClickListener {


            val nomeUsuario = etNomeUsuario.text.toString()
            val sobrenome = etSobrenome.text.toString()

            tvHello.text = "Olá, $nomeUsuario $sobrenome"

        }

        btCalculadora.setOnClickListener {
            //Navegar para tela de calculadora

            val intent = Intent(this, CalculadoraActivity::class.java)

            startActivity(intent)

        }


    }
}
