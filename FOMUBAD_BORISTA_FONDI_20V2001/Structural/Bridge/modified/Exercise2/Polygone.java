package FOMUBAD_BORISTA_FONDI_20V2001.Structural.Bridge.modified.Exercise2;

public class Polygone extends Shape{
    public Polygone(Color color) {
        super(color);
    }

    @Override
    public void colorIt() {
        System.out.print("Polygone filled with : ");
        this.color.fillColor();
    }

}
