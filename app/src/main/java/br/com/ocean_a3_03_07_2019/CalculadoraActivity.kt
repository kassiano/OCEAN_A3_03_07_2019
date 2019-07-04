package br.com.ocean_a3_03_07_2019

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_calculadora.*

class CalculadoraActivity : AppCompatActivity() {

    enum class Operacao{
        Soma,Subtracao,Divisao,Multiplicacao
    }

    // https://www.codepile.net/pile/M8oEXmnz

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calculadora)


        btSomar.setOnClickListener {
            efetuarCalculo(Operacao.Soma)
        }

        btDividir.setOnClickListener {
            efetuarCalculo(Operacao.Divisao)
        }

        btMultiplicar.setOnClickListener {
            efetuarCalculo(Operacao.Multiplicacao)
        }

        btSubtrair.setOnClickListener {
            efetuarCalculo(Operacao.Subtracao)
        }
    }


    fun efetuarCalculo(operacao:Operacao){

        if(etValor1.text.isEmpty()){
            etValor1.error = "Preencha um valor"
            return
        }

        if(etValor2.text.isEmpty()){
            etValor2.error = "Preencha um valor"
            return
        }

        val valor1 = etValor1.text.toString().toInt()
        val valor2 = etValor2.text.toString().toInt()

        val resultado = when(operacao){
            Operacao.Soma-> valor1 + valor2
            Operacao.Divisao-> valor1 / valor2
            Operacao.Multiplicacao-> valor1 * valor2
            Operacao.Subtracao-> valor1 - valor2
        }

        tvResultado.text = "$resultado"
        Toast.makeText(this, "O resultado é $resultado", Toast.LENGTH_LONG).show()

    }


}
