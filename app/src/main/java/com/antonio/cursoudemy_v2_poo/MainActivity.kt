package com.antonio.cursoudemy_v2_poo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val antonio = Persona("Antonio Lorenzo", "76912388C")
        val anonimo = Persona()
        anonimo.Persona()
        antonio.alive = true
        antonio.die()
        println(antonio.alive)
        println(antonio.nombre)
        println(antonio.pasaporte)

        println(anonimo.nombre)
        println(anonimo.pasaporte)


        val bicho:Pokemon= Pokemon()
        println(bicho.getName())
        bicho.setName("Pepe")
        println(bicho.getName())
    }
}