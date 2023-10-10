package Exercise2;

public class ProductFactory1 extends ProductFactory {

    @Override
    public ProductA createProductA() {
        return new ProductA1();
    }
    
}
