package FOMUBAD_BORISTA_FONDI_20V2001.Structural.Decorator.modified.code;

public class DecorateurCurseurHorizontal extends DecorateurFenetre {

    public DecorateurCurseurHorizontal(Fenetre fenetre) {
        super(fenetre);
    }

    @Override
    public void dessiner() {
        super.dessiner();
        System.out.println("Decore Dessine DecorateurCurseurHorizontal");
    }

    @Override
    public void decrire() {
        super.decrire();
        System.out.println("Decorate Decrire DecorateurCurseurHorizontal");
    }

    public void dessineCurseurHorizontal() {
        System.out.println("Dessine DecorateurCurseurHorizontal");
    }
}
