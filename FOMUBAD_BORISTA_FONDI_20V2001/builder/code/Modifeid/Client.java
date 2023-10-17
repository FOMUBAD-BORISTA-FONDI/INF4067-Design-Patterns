package FOMUBAD_BORISTA_FONDI_20V2001.builder.code.Modifeid;

public class Client {
    
    public static void main(String[] args) {
        MonteurPizza monteurPizzaPiquante = new MonteurPizzaPiquante();
        MonteurPizza monteurPizzaReine = new MonteurPizzaReine();
        MonteurPizza monterPizzaLocal = new MonteurPizzaLocal();

        Directeur directeur = new Directeur(monteurPizzaReine);
        directeur.Construire();

        directeur.setMonteurPizza(monteurPizzaPiquante);
        directeur.Construire();

        directeur.setMonteurPizza(monterPizzaLocal);
        directeur.Construire();
    }
}
