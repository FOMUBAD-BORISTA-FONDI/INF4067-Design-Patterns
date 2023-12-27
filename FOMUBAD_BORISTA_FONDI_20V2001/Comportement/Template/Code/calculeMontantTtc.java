public abstract class calculeMontantTtc {
   float montantHt = 0;
    float montantva = 0;
    float montantTtc = 0;

    public void CalculerMontantTtc() {
        this.montantHt = montantHt;
        this.montantva = montantva;
        
    }
    public void  afficher() {
        System.out.println("The HT Price is at : " + montantHt);
        System.out.println("The TVA Price is at : " + montantva);
        System.out.println("The TTC Price is at : " + montantTtc);
    }
}
