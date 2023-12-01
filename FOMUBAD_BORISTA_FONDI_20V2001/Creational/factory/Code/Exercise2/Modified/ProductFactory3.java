package FOMUBAD_BORISTA_FONDI_20V2001.Creational.factory.Code.Exercise2.Modified;

public class ProductFactory3 extends ProductFactory{
    

    @Override
    public ProductA createProductA() {
        return new ProductA3();
    }
}
