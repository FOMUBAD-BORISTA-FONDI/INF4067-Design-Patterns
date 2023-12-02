package FOMUBAD_BORISTA_FONDI_20V2001.Structural.Bridge.modified.code;

public class Circle extends Shape{
    public Circle(Color color) {
        super(color);
    }

    @Override
    public void colorIt() {
        System.out.print("Circle filled with : ");
        this.color.fillColor();
    }

}
