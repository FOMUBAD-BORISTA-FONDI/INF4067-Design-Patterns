//FOMUBAD BORISTA FONDI 20V2001
public class Cleint {
    public static void main(String[] args) {
        Image image = new ImageImpl("image.jpg", "JPEG");

        image.compresser();

        Filtre filtreNiveauxDeGris = new FiltreContraste();
        filtreNiveauxDeGris.appliquer(image);

        Filtre filtreContraste = new FiltreNoirBlanc();
        filtreContraste.appliquer(image);
    }
}