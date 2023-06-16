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
    override val decription: String = "Mur de jardin"
}

class PieceJardin : IPiece {
    override val objectSet: MutableSet<IElementLabyrinthe> = mutableSetOf()
    override val decription: String = "Piece de jardin"
}

class PorteJardin : IPorte {
    override var open: Boolean = false
    override val decription: String = "Porte de jardin"
}