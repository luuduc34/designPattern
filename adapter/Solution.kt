package be.technifutur.decouvertekotlin.designPattern.adapter

import be.technifutur.decouvertekotlin.designPattern.strategie.Canard

class Solution(val canard: Canard):Animal{
    override fun crier() {
       println(canard.effectuerCancan())
    }

    override fun courir() {
        println(canard.effectuerVol())
    }

}