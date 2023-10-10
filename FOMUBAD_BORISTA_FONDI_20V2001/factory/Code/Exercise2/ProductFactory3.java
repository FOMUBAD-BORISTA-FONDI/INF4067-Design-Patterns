package Exercise2;

public class ProductFactory3 extends ProductFactory{
    

    @Override
    public ProductA createProductA() {
        return new ProductA3();
    }
}
