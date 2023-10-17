package Exercise2.Modified;

// import Exercise2.Modified.ProductA;

public abstract class ProductFactory {

    

    public ProductA getProductA() {
        return createProductA();
        
    }

    public abstract ProductA createProductA() ;
}
