package be.technifutur.decouvertekotlin.designPattern.adapter

open class Chasseur {
    fun tirer (animal:Animal){
        println("Pan")
        animal.crier()
        animal.courir()
    }
}

interface Animal {
    fun crier()
    fun courir()
}