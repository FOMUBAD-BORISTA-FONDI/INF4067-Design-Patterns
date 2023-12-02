package FOMUBAD_BORISTA_FONDI_20V2001.Structural.Adapter.modified.code.document;

public class ServeurWeb {

    public static void main(String[] args) {

        ComposantPdf composantPdf = new ComposantPdf();
        Document document = new DocumentPdf(composantPdf);

        document.setContenu("new content");

        document.dessine();
        document.imprime();
    }
}
