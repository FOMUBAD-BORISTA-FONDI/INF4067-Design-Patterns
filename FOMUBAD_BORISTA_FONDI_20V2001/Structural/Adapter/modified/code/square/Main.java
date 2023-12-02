package FOMUBAD_BORISTA_FONDI_20V2001.Structural.Adapter.modified.code.square;

public class Main {

    public static void main(String[] args) {

        Icarre icarre = new AdaptRectangle();

        float perimetre = icarre.perimetre(3);
        float aire = icarre.aire(3);

        System.out.println(perimetre);
        System.out.println(aire);
    }
}
