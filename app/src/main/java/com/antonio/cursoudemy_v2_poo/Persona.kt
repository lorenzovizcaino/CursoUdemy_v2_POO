package com.antonio.cursoudemy_v2_poo

open class Persona(var nombre: String = "Anonimo", var pasaporte: String? = null) {
    //si pongo String = "Anonimo" creo el objeto con ese nombre por defecto
    var alive: Boolean = true


    //tambien puedo llamar a la funcion con el mismo nombre de la clase para darle  valores por defecto
    fun Persona(){
        nombre="Luis"
        pasaporte="00000000Z"
    }

    fun die() {
        alive = false
    }
}

class Atleta (nombre:String, pasaporte: String?, var deporte: String): Persona(nombre, pasaporte){

}