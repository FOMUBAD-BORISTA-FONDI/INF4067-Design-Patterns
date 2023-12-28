public class CommandeCameroun extends Commande {

    public CommandeCameroun(float montantHt) {
        super(montantHt);
    }

    @Override
    protected float calculeTva() {
        //The TVA tax in Cameroun: 19.25%
        return montantHt * 0.1925f;
    }
}
