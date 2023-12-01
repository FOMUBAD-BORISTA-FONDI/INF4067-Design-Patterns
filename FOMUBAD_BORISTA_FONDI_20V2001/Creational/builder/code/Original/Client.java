package FOMUBAD_BORISTA_FONDI_20V2001.Creational.builder.code.Original;

public class Client {
    
    public static void main(String[] args) {
        MonteurPizza monteurPizzaPiquante = new MonteurPizzaPiquante();
        MonteurPizza monteurPizzaReine = new MonteurPizzaReine();

        Directeur directeur = new Directeur(monteurPizzaReine);

        directeur.Construire();
        directeur.setMonteurPizza(monteurPizzaPiquante);
        directeur.Construire();
    }
}
