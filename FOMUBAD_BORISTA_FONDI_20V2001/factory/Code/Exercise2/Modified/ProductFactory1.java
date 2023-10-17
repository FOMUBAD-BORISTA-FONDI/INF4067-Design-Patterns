package Exercise2.Modified;

public class ProductFactory1 extends ProductFactory {

    @Override
    public ProductA createProductA() {
        return new ProductA1();
    }
    
}
