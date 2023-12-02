package FOMUBAD_BORISTA_FONDI_20V2001.Structural.Adapter.modified.code.square;

public class Rectangle {

    private float longeur;
    private float largeur;

    public void setLongeur(float longeur) {
        this.longeur = longeur;
    }

    public void setLargeur(float largeur) {
        this.largeur = largeur;
    }

    public float perimetre() {
        return (longeur + largeur) * 2;
    }

    public float aire() {
        return longeur * largeur;
    }
}
