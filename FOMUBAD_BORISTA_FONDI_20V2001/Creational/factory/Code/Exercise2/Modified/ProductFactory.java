package FOMUBAD_BORISTA_FONDI_20V2001.Creational.factory.Code.Exercise2.Modified;

// import Exercise2.Modified.ProductA;

public abstract class ProductFactory {

    

    public ProductA getProductA() {
        return createProductA();
        
    }

    public abstract ProductA createProductA() ;
}
