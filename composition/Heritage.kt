package be.technifutur.decouvertekotlin.designPattern.composition

class Heritage {


}

fun main() {
    val c = C()
    val b = B()

    println(c.getCpt())
    c.inc(3)
    println(c.getCpt())

    println(b.getCpt())
    b.afficher()

}

class B {
    private val commun: A = A() // on instancie une variable de type A pour avoir accès aux méthodes de la classe A
    fun getCpt(): Int {
        return commun.getCpt()
    }
    fun afficher() {
        println("Le compteur est à ${getCpt()}")
    }
}

class C {
    private val commun: A = A()
    fun getCpt(): Int {
        return commun.getCpt()
    }
    fun inc(qt: Int) {
        repeat(qt) {
            getCpt()
        }
    }
}

open class A {
    private var cpt: Int = 0
    fun getCpt(): Int {
        return cpt++
    }
}