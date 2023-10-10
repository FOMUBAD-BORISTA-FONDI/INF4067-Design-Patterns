package Exercise2;

public abstract class ProductFactory {

    

    public ProductA getProductA() {
        return createProductA();
        
    }

    public abstract ProductA createProductA() ;
}
