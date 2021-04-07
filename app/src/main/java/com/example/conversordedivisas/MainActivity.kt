package com.example.conversordedivisas

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.conversordedivisas.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    var euro = 4340
    var dollar = 3674
    private lateinit var mainBinding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mainBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(mainBinding.root)

        mainBinding.buttonConversion.setOnClickListener {
            var valor = (mainBinding.editTextNumberIn.text.toString()).toFloat()
            if (mainBinding.radioButtonDollarIn.isChecked){
                valor= valor*dollar
            }
            else if (mainBinding.radioButtonEuroIn.isChecked){
                valor= valor*euro
            }
            else if (mainBinding.radioButtonPesoIn.isChecked){
                valor=valor
            }

            if (mainBinding.radioButtonDollarOut.isChecked){
                valor= valor/dollar
            }
            else if (mainBinding.radioButtonEuroOut.isChecked){
                valor= valor/euro
            }
            else if (mainBinding.radioButtonPesoOut.isChecked){
                valor=valor
            }

            mainBinding.TextViewNumberOut.setText(valor.toString())

        }//OnClick

    }//onCreate

}//Main