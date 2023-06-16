package be.technifutur.decouvertekotlin.designPattern.factory

class ChateauFactory : IAbstractFactory {
    override fun createMur(): IMur {
        return MurChateau()
    }

    override fun createPiece(): IPiece {
        return PieceChateau()
    }

    override fun createPorte(): IPorte {
        return PorteChateau()
    }
}

class MurChateau : IMur {
    override var decoration: String = "Mur sans décoration"
    override val description: String = "Mur de chateau"
}

class PieceChateau : IPiece {
    override var objectSet: MutableSet<IElementLabyrinthe> = mutableSetOf()
    override val description: String = "Piece de chateau"
}

class PorteChateau : IPorte {
    override var open: Boolean = false
    override val description: String = "Porte de chateau"
}