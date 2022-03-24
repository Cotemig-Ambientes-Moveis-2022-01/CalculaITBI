package br.com.cotemig.calculaitbi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var btnCalcular = findViewById<Button>(R.id.btnCalcular)

        btnCalcular.setOnClickListener {
            calcularITBI()
        }

    }

    fun calcularITBI() {

        var cidade = findViewById<EditText>(R.id.cidade)
        var valorImovel = findViewById<EditText>(R.id.valor)

        var valor = valorImovel.text.toString().toDouble()

        var itbi = 0.0

        if (cidade.text.toString() == "1") {
            itbi = valor * 0.03
        } else if (cidade.text.toString() == "2") {
            itbi = valor * 0.0275
        } else if (cidade.text.toString() == "3") {
            itbi = valor * 0.02
        }

        var intent = Intent(this, ResultadoActivity::class.java)
        intent.putExtra("valor_itbi", itbi)
        startActivity(intent)

    }

}