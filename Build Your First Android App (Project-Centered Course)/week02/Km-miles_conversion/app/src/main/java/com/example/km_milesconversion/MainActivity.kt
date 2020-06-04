package com.example.km_milesconversion

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button;
import android.widget.EditText
import java.math.BigDecimal


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val convertMilesToKm: Button = findViewById(R.id.buttonMilesToKm)
        convertMilesToKm.setOnClickListener{
                    val textBoxMiles: EditText = findViewById(R.id.inputMiles)
                    val textBoxKm: EditText = findViewById(R.id.inputKm)
                    val vMiles  = textBoxMiles.text.toString().toInt()
                    val vKm = BigDecimal(vMiles)/ BigDecimal(0.62137)
                    textBoxKm.setText(vKm.toString())
        }
        val convertKmToMiles: Button = findViewById(R.id.buttonKmToMiles)
        convertKmToMiles.setOnClickListener{
            val textBoxMiles: EditText = findViewById(R.id.inputMiles)
            val textBoxKm: EditText = findViewById(R.id.inputKm)
            val vKm  = textBoxKm.text.toString().toInt()
            val vMiles = BigDecimal(vKm) * BigDecimal(0.62137)
            textBoxMiles.setText(vMiles.toString())
        }
    }
}

