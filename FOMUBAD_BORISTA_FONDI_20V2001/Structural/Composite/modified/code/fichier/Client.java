package FOMUBAD_BORISTA_FONDI_20V2001.Structural.Composite.modified.code.fichier;

public class Client {

    public static void main(String[] args) {

        Fichier fichier = new Fichier("file", "texte");

        Dossier dossier = new Dossier("folder", "dossier");

        dossier.ajouter(fichier);
        dossier.decrire();

        dossier.supprimer();

    }

}
