package FOMUBAD_BORISTA_FONDI_20V2001.Structural.Decorator.modified.code;

public class FenetreSimple implements Fenetre{


    @Override
    public void dessiner() {
    System.out.println("Dessine Fenetre Simple");
    }

    @Override
    public void decrire() {
        System.out.println("Decrire Fenetre Simple");
    }
}
