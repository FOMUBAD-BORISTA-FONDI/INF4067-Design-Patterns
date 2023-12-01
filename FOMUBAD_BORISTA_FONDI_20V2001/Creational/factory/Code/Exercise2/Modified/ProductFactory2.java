package FOMUBAD_BORISTA_FONDI_20V2001.Creational.factory.Code.Exercise2.Modified;

// import Exercise2.Modified.ProductA2;

// import Exercise2.Modified.ProductA;

public class ProductFactory2 extends ProductFactory{

    
    @Override
    public ProductA createProductA() {
        return new ProductA2();
    }
}
