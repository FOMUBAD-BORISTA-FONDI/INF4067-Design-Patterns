package FOMUBAD_BORISTA_FONDI_20V2001.Structural.Decorator.modified.Exercise1;

public class DecorateurCurseurVertical extends DecorateurFenetre {

    public DecorateurCurseurVertical(Fenetre fenetre) {
        super(fenetre);
    }

    @Override
    public void dessiner() {
        super.dessiner();
        System.out.println("Decore Dessine DecorateurCurseurVertical");
    }

    @Override
    public void decrire() {
        super.decrire();
        System.out.println("Decore Decrire DecorateurCurseurVertical");
    }

    public void dessineCurseurVertical() {
        System.out.println("Dessine DecorateurCurseurVertical");
    }
}
