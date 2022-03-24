package br.com.cotemig.calculaitbi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import java.text.NumberFormat
import java.util.*

class ResultadoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resultado)

        var itbi = intent.getDoubleExtra("valor_itbi", 0.0)

        var resultado = findViewById<TextView>(R.id.resultado)

        var f = NumberFormat.getCurrencyInstance(Locale.forLanguageTag("pt-br"))

        resultado.text = f.format(itbi)

    }
}