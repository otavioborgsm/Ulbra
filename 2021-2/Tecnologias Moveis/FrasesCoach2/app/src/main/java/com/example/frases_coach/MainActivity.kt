package com.example.frases_coach

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.TextView
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var btnFrase = findViewById<Button>(R.id.btnFrase)


        btnFrase.setOnClickListener(View.OnClickListener {
            gerar(btnFrase)
        })
    }

    fun gerar(view: View){

        val sorteio = Random.nextInt(0,9)
        val i = Log.i("Sorteio", "Número sorteado: $sorteio")


        var frase = when(sorteio){

            0 -> getString(R.string.frasesCoach)
            1 -> getString(R.string.frasesCoachDois)
            2 -> getString(R.string.frasesCoachTres)
            3 -> getString(R.string.frasesCoachQuatro)
            4 -> getString(R.string.frasesCoachCinco)
            5 -> getString(R.string.frasesCoachSeis)
            6 -> getString(R.string.frasesCoachSete)
            7 -> getString(R.string.frasesCoachOito)
            8 -> getString(R.string.frasesCoachNove)
            9 -> getString(R.string.frasesCoachDez)

            else ->""

        }

        var txt = findViewById<TextView>(R.id.txtFrase)
        txt.text = frase

    }
}