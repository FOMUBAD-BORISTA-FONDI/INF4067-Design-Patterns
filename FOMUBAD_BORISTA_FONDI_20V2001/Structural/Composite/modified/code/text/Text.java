package FOMUBAD_BORISTA_FONDI_20V2001.Structural.Composite.modified.code.text;

public abstract class Text {

    private String titre;
    private String preambule;

    public abstract int longeur();

    public abstract void ajout(Text text);

    public abstract void retrait(int index);

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getPreambule() {
        return preambule;
    }

    public void setPreambule(String preambule) {
        this.preambule = preambule;
    }
}
