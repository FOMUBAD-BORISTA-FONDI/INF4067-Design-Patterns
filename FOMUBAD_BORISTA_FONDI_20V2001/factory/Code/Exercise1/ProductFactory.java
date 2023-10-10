package Exercise1;

public class ProductFactory {

    public static final int TYPE_PRODUCTA1 = 1;
    public static final int TYPE_PRODUCTA2 = 2;
    public static final int TYPE_PRODUCTA3 = 3;

    public ProductA getProductA(int typeproduct) {
        ProductA productA = null;

        switch (typeproduct) {
            case TYPE_PRODUCTA1:
                productA = new ProductA1();
                break;

            case TYPE_PRODUCTA2:
                productA = new ProductA2();
                break;
                
            case TYPE_PRODUCTA3:
                productA = new ProductA3();
                break;
        
            default:
                throw new IllegalArgumentException("Unknown product type");
        }

        return productA;
        
    }
}
