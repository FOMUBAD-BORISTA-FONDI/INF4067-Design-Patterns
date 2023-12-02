package FOMUBAD_BORISTA_FONDI_20V2001.Structural.Decorator.modified.Exercise1;

abstract public class DecorateurFenetre implements Fenetre {
    protected Fenetre fenetreDecoree;

    DecorateurFenetre(Fenetre fenetre) {
        this.fenetreDecoree = fenetre;
    }

    @Override
    public void dessiner() {
        this.fenetreDecoree.dessiner();
    }

    @Override
    public void decrire() {
        this.fenetreDecoree.decrire();
    }
}
