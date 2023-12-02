package FOMUBAD_BORISTA_FONDI_20V2001.Structural.Composite.modified.code.fichier;

public class Fichier extends Repertoire {

    Fichier(String nom, String type) {
        super(nom, type);
    }

    @Override
    void decrire() {
        System.out.println(getNom() + " " + getType());
    }

    @Override
    void supprimer() {
        System.out.println("deleted");

    }

}
