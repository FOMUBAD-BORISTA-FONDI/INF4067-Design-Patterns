package FOMUBAD_BORISTA_FONDI_20V2001.Structural.Decorator.modified.code;

public class Main {
    public static void main(String[] args) {

        Fenetre f = new FenetreSimple();

        DecorateurFenetre decorateurFenetreVerticale = new DecorateurCurseurVertical(f);

        DecorateurFenetre decorateurFenetreHorizontal = new DecorateurCurseurHorizontal(decorateurFenetreVerticale);

        decorateurFenetreHorizontal.decrire();

    }
}