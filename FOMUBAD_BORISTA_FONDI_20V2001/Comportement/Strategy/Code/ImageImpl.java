
public class ImageImpl implements Image {

    private String nom; 
    private String format;

    public ImageImpl(String nom,String format) {
        this.nom = nom; 
        this.format = format;
    }

    @Override
    public String getNom() {
        return nom;
    }

    @Override
    public void setNom(String nom) {
        this.nom = nom;
    }


    @Override
    public String getFormat() {
        return format;
    }

    @Override
    public void setFormat(String format) {
        this.format = format;
    }

    @Override
    public void compresser() {
        System.out.println("Implementing the compression of the image by their format");
    }

    @Override
    public void appliquerFiltre(Filtre filtre) {
         System.out.println("Implementing application of the filter on the image");
    }
}
