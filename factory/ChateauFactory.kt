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
    override val decription: String = "Mur de chateau"
}

class PieceChateau : IPiece {
    override val objectSet: MutableSet<IElementLabyrinthe> = mutableSetOf()
    override val decription: String = "Piece de chateau"
}

class PorteChateau : IPorte {
    override var open: Boolean = false
    override val decription: String = "Porte de chateau"
}