package com.example.logonrm.imc

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_formulario.*

class FormularioActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_formulario)

        btnCalcular.setOnClickListener{
            val telaResultado = Intent(this, ResultadoActivity::class.java)

            telaResultado.putExtra("PESO", inputPeso.editText?.text.toString())
            telaResultado.putExtra("ALTURA", inputAltura.editText?.text.toString())

            startActivity(telaResultado)
        }

        btnLimpar.setOnClickListener{
            // Digite seu comentario
            inputAltura.editText?.setText("")
            inputPeso.editText?.setText("")
        }
    }
}
