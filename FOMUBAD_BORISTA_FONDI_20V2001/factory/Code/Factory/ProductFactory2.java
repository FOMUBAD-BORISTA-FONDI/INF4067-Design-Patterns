package Exercise2;

public class ProductFactory2 extends ProductFactory{

    
    @Override
    public ProductA createProductA() {
        return new ProductA2();
    }
}
