package Exercise2.Modified;

public class ProductFactory3 extends ProductFactory{
    

    @Override
    public ProductA createProductA() {
        return new ProductA3();
    }
}
