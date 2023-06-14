package be.technifutur.decouvertekotlin.designPattern.defis

import be.technifutur.decouvertekotlin.designPattern.Canard

class Solution(val canard:Canard):Animal{
    override fun crier() {
        return canard.effectuerCancan()
    }

    override fun courir() {
        return canard.effectuerVol()
    }

}