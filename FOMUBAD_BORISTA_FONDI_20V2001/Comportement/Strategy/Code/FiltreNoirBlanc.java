
public class FiltreNoirBlanc implements Filtre {

    @Override
    public String getNom() {
        return "Black and White";
    }

    @Override
    public void appliquer(Image image) {
       System.out.println("Implementing the Black on white filter on the Image");
    }
}
