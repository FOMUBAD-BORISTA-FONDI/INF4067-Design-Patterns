public class CommandeGabon extends Commande {

    public CommandeGabon(float montantHt) {
        super(montantHt);
    }

    @Override
    protected float calculeTva() {
        //The TVA tax in Gabon: 18%
        return montantHt * 0.18f;
    }
}
