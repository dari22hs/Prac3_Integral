package com.example.prac3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast

/**
 * Darío Huallpa 10A
 * Práctica 3
 */


class MainActivity : AppCompatActivity() {

    lateinit var cNum1: EditText
    lateinit var cNum2: EditText


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        cNum1 = findViewById<EditText>(R.id.gNum1)
        cNum2 = findViewById<EditText>(R.id.gNum2)

    }//Fin método onCreate

    fun aceptar(vista: View){
        //var resultado: Int = Integer.parseInt(cNum1.text.toString())
        var result: Int = operacion()
        Toast.makeText(this, "El resutado es $result", Toast.LENGTH_SHORT).show()
    }//Fin función aceptar

    fun operacion(): Int{
        var num1: Int = Integer.parseInt(cNum1.text.toString())
        var num2: Int = Integer.parseInt(cNum2.text.toString())
        return num1 + num2;
    }//Fin función operación

}//Fin class MainActivity