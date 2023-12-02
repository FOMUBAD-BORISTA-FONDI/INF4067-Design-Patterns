package FOMUBAD_BORISTA_FONDI_20V2001.Structural.Bridge.modified.code;


abstract public class Shape {
    protected Color color;

    Shape(Color color){
        this.color = color;
    }

    abstract public void colorIt();
}
