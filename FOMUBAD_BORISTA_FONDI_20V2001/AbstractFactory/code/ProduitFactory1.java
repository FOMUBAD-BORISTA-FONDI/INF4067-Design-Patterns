package FOMUBAD_BORISTA_FONDI_20V2001.AbstractFactory.code;

// import FOMUBAD_BORISTA_FONDI_20V2001.AbstractFactory.code.ProduitC1;

public class ProduitFactory1 implements IProduitFactory {

    @Override
    public ProduitA getProduitA() {
        return new ProduitA1();
    }

    @Override
    public ProduitB getProduitB() {
        return new ProduitB1();
    }

    @Override
    public ProduitC getProduitC() {
        return new ProduitC1();
    }
    
}
