package FOMUBAD_BORISTA_FONDI_20V2001.Structural.Composite.modified.code.text;

import java.util.ArrayList;
import java.util.List;

public class Section extends Text {

    private List<Text> sousSection = new ArrayList<>();

    @Override
    public int longeur() {
        int sum = 0;
        for (Text texte : sousSection) {
            sum = sum + texte.longeur();
        }

        return sum;
    }

    @Override
    public void ajout(Text text) {
        this.sousSection.add(text);
    }

    @Override
    public void retrait(int index) {
        if (index <= sousSection.size()) {
            sousSection.remove(index);
        }
    }

    public List<Text> getSousection() {
        return this.sousSection;
    }

}
