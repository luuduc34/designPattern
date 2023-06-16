package be.technifutur.decouvertekotlin.designPattern.factory

class JardinFactory : IAbstractFactory {
    override fun createMur(): IMur {
        return MurJardin()
    }

    override fun createPiece(): IPiece {
        return PieceJardin()
    }

    override fun createPorte(): IPorte {
        return PorteJardin()
    }
}

class MurJardin : IMur {
    override var decoration: String = "Mur sans décoration"
    override val description: String = "Mur de jardin"
    override fun toString(): String {
        return "MurJardin(decoration='$decoration', description='$description')"
    }
}

class PieceJardin : IPiece {
    override var objectSet: MutableSet<IElementLabyrinthe> = mutableSetOf()
    override val description: String = "Piece de jardin"
    override fun toString(): String {
        return "PieceJardin(objectSet=$objectSet, description='$description')"
    }
}

class PorteJardin : IPorte {
    override var open: Boolean = false
    override val description: String = "Porte de jardin"
    override fun toString(): String {
        return "PorteJardin(open=$open, description='$description')"
    }

}