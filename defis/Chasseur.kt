package be.technifutur.decouvertekotlin.designPattern.defis

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