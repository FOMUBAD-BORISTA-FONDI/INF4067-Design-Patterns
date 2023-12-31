package FOMUBAD_BORISTA_FONDI_20V2001.Structural.Composite.modified.code.text;

public class Client {

    public static void main(String[] args) {
        Text paragraph = new Paragraphe();
        paragraph.setPreambule("sub preamble");
        paragraph.setTitre("sub title");

        Section section = new Section();

        section.setTitre("main title");
        section.ajout(paragraph);
        section.setPreambule("main preamble");

        paragraph.retrait(0);
        System.out.println(section.getTitre());
        System.out.println(section.getPreambule());
        for (Text texte : section.getSousection()) {

            System.out.println(texte.getTitre());
            System.out.println(texte.getPreambule());

        }

    }
}
