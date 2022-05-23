package com.example.nestedlayouts

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val button_roll: TextView = findViewById(R.id.roll_button)
        val form11: TextView = findViewById(R.id.nom1)
        val form12: TextView = findViewById(R.id.nom2)
        val form13: TextView = findViewById(R.id.nom3)
        val form21: TextView = findViewById(R.id.nom4)
        val form22: TextView = findViewById(R.id.nom5)
        val form23: TextView = findViewById(R.id.nom6)
        val form31: TextView = findViewById(R.id.nom7)
        val form32: TextView = findViewById(R.id.nom8)
        val form33: TextView = findViewById(R.id.nom9)
        var counter: Int = 1

        button_roll.setOnClickListener {
            counter +=1
            if (counter % 3 == 1) {
                form11.text = counter.toString()
                form21.text = counter.toString()
                form31.text = counter.toString()
                form12.text = null
                form13.text = null
                form22.text = null
                form23.text = null
                form32.text = null
                form33.text = null
            }
            else if (counter % 3 == 2) {
                form12.text = counter.toString()
                form22.text = counter.toString()
                form32.text = counter.toString()
                form11.text = null
                form13.text = null
                form21.text = null
                form23.text = null
                form31.text = null
                form33.text = null
            }
            else {
                form13.text = counter.toString()
                form23.text = counter.toString()
                form33.text = counter.toString()
                form11.text = null
                form12.text = null
                form21.text = null
                form22.text = null
                form31.text = null
                form32.text = null
            }
        }
    }

}