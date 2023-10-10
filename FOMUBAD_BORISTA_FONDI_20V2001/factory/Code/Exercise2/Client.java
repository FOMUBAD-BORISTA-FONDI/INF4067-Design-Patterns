package Exercise2;

/**
 * client
 */
public class Client {

    public static void main(String[] args) {
        ProductFactory productFactory1 = new ProductFactory1();
        ProductFactory productFactory2 = new ProductFactory2();
        ProductFactory productFactory3 = new ProductFactory3();

        ProductA productA = null;

        System.out.println("Using the first fabric");
        productA = productFactory1.getProductA();
        productA.methodA();

        System.out.println("Using the second fabric");
        productA = productFactory2.getProductA();
        productA.methodA();

        System.out.println("Using the third fabric");
        productA = productFactory3.getProductA();
        productA.methodA();
    }
}