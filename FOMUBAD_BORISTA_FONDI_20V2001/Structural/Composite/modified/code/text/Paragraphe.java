package FOMUBAD_BORISTA_FONDI_20V2001.Structural.Composite.modified.code.text;


public class Paragraphe extends Text {

    @Override
    public int longeur() {
        return getPreambule().length();
    }

    @Override
    public void ajout(Text text) {
        setPreambule(getPreambule());
    }

    @Override
    public void retrait(int index) {

        char[] array = getPreambule().toCharArray();
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < array.length; ++i) {
            if (i == index) {
                continue;
            }

            result.append(array[i]);
        }

        setPreambule(result.toString());

    }

}
