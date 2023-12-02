package FOMUBAD_BORISTA_FONDI_20V2001.Structural.Adapter.modified.code.square;

public class AdaptRectangle implements Icarre {

    private Rectangle rectangle;

    AdaptRectangle() {
        this.rectangle = new Rectangle();
    }

    @Override
    public float perimetre(float cote) {
        rectangle.setLargeur(cote);
        rectangle.setLongeur(cote);
        return rectangle.perimetre();
    }

    @Override
    public float aire(float cote) {
        rectangle.setLargeur(cote);
        rectangle.setLongeur(cote);
        return rectangle.aire();
    }

}
