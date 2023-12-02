package FOMUBAD_BORISTA_FONDI_20V2001.Structural.Bridge.modified.Exercise2;

public class Main {
    public static void main(String[] args) {

        Shape s1 = new Rectangle(new RedColor());
        s1.colorIt();

        Shape s2 = new Circle(new BlueColor());
        s2.colorIt();

        Shape s3 = new Polygone(new YellowColor());
        s3.colorIt();

    }
}