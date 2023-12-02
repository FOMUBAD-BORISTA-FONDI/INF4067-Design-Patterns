package FOMUBAD_BORISTA_FONDI_20V2001.Structural.Bridge.modified.code;

public class Rectangle extends Shape {

    public Rectangle(Color color) {
        super(color);
    }

    @Override
    public void colorIt() {
        System.out.print("Rectangle filled with : ");
        this.color.fillColor();
    }
}
