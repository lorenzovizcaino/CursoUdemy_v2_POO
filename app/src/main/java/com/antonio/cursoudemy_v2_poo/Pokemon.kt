package com.antonio.cursoudemy_v2_poo

class Pokemon(
    private var name: String = "Pok",
    private var attackPower: Float = 30f,
    private var life: Float = 100f) {


    fun Pokemon(name:String, attackPower: Float){
        this.name=name
        this.attackPower=attackPower
        life=100f
    }

    fun getName():String{
        return name
    }

    fun setName(name: String){
        this.name=name
    }

    fun getAttackPower():Float{
        return attackPower
    }

    fun setAttackPower(attackPower: Float){
        this.attackPower=attackPower
    }

    fun getLife():Float{
        return life
    }
    fun setLife(life: Float){
        this.life=life
    }





}