package FOMUBAD_BORISTA_FONDI_20V2001.AbstractFactory.code;

public class ProduitFactory2 implements IProduitFactory {

    @Override
    public ProduitA getProduitA() {
        return new ProduitA2();
    }

    @Override
    public ProduitB getProduitB() {
        return new ProduitB2();
    }

    @Override
    public ProduitC getProduitC() {
        return new ProduitC2();
    }
    
}
