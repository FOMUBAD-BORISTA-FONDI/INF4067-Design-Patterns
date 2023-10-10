package Exercise1;
/**
 * client
 */
public class Client {

    public static void main(String[] args) {
        ProductFactory productFactory = new ProductFactory();

        ProductA productA = null;

        productA = productFactory.getProductA(ProductFactory.TYPE_PRODUCTA1);
        productA.methodA();

        productA = productFactory.getProductA(ProductFactory.TYPE_PRODUCTA2);
        productA.methodA();

        productA = productFactory.getProductA(ProductFactory.TYPE_PRODUCTA3);
        productA.methodA();

        productA = productFactory.getProductA(4);
        productA.methodA();
    }
}