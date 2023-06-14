package be.technifutur.decouvertekotlin.designPattern

class Strategie {

}

fun main() {

}

open class Canard {
    val comportementVol = ComportementVol()
    val comportementCancan = ComportementCancan()
    fun nager(){}
    fun afficher(){}
    fun effectuerVol(){
        comportementVol.effectuerVol()
    }
    fun effectuerCancan(){
        comportementCancan.effectuerCancan()
    }
}

open class ComportementVol {
    fun effectuerVol(){}
}

class ComportementCancan {
    fun effectuerCancan(){}
}

class Colvert :Canard() {

}
class Leurre :Canard() {

}
class Mandarin :Canard() {

}
class CanardEnPlastique :Canard() {

}
