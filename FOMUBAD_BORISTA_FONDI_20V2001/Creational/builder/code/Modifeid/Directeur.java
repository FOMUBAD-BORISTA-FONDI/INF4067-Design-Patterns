package FOMUBAD_BORISTA_FONDI_20V2001.Creational.builder.code.Modifeid;

public class Directeur {
    
    private MonteurPizza monteurAbstrait;
   
    Directeur (MonteurPizza monteurPizza) {
        monteurAbstrait = monteurPizza;
    }
    
    public void Construire() {

        monteurAbstrait.creerNouvellePizza();
        monteurAbstrait.monterPate();
        monteurAbstrait.monterGarniture();
        monteurAbstrait.monterSauce();
        monteurAbstrait.getPizza().print();
    }

    public void setMonteurPizza(MonteurPizza monteurPizza) {
        this.monteurAbstrait = monteurPizza;
    }
}
