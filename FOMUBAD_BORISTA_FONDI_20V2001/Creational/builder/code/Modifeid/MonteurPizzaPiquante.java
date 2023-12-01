package FOMUBAD_BORISTA_FONDI_20V2001.Creational.builder.code.Modifeid;

public class MonteurPizzaPiquante extends MonteurPizza {

    @Override
    public void monterPate() {
        pizza.setPate("feuilletée");
    }

    @Override
    public void monterSauce() {
        pizza.setSauce("piquante");
    }

    @Override
    public void monterGarniture() {
        pizza.setGarniture("pepperoni+salami");
    }
    
}
