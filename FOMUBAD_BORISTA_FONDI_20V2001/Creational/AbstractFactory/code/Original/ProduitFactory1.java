package FOMUBAD_BORISTA_FONDI_20V2001.Creational.AbstractFactory.code.Original;

public class ProduitFactory1 implements IProduitFactory {

    @Override
    public ProduitA getProduitA() {
        return new ProduitA1();
    }

    @Override
    public ProduitB getProduitB() {
        return new ProduitB1();
    }
    
}
