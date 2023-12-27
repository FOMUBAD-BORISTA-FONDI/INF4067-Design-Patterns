
public class FiltreContraste implements Filtre {

    @Override
    public String getNom() {
        return "Contrast";
    }

    @Override
    public void appliquer(Image image) {
       System.out.println("Implementing the contrast filter on the image");
    }
}
