package be.technifutur.decouvertekotlin.designPattern.factory

interface IAbstractFactory {
    fun createMur(): IMur
    fun createPiece(): IPiece
    fun createPorte(): IPorte
}

interface IPorte : IElementLabyrinthe {
    var open: Boolean
}

interface IPiece : IElementLabyrinthe {
    var objectSet: MutableSet<IElementLabyrinthe>
}

interface IMur : IElementLabyrinthe {
    val decoration: String
}

interface IElementLabyrinthe {
    val description: String
}

fun getFactory(type: String): IAbstractFactory? {
    return when (type) {
        "Chateau" -> ChateauFactory()
        "Jardin" -> JardinFactory()
        else -> null
    }
}

fun main() {
    val factory = getFactory("Chateau")

    if (factory != null) {
        listOf<IElementLabyrinthe>(
            factory.createMur(),
            factory.createPiece(),
            factory.createPorte(),
            factory.createMur()
        ).forEach { println(it.description) }
    } else {
        println("echec")
    }
}