public class Alberlet extends Lakas implements Berelheto{
    protected int honapokSzama;
    
    public Alberlet(int terulet, double szobakSzama, int lakok, int nmAr, int honapokSzama) {
        super(terulet, szobakSzama, lakok, nmAr);
        this.honapokSzama = honapokSzama;
    }
    
    @Override
    public boolean bekoltozik(int lakok) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double mennyibeKerul(int honapokszama) {
        double egyforejutoKoltseg;
        if (super.lakok == 0){
            egyforejutoKoltseg = -1;
        }
        else{
            egyforejutoKoltseg = super.osszesKoltseg() / super.lakok;
        }
        return egyforejutoKoltseg;
    }

    @Override
    public boolean lefoglaltE() {
        boolean lefoglaltE;
        if(honapokSzama == 0){
            lefoglaltE = false;
        }
        else{
            lefoglaltE = true;
        }
        return lefoglaltE;
    }

    @Override
    public boolean lefoglal(int lefoglalnikivantHonap) {
        boolean foglalas;
        if (lefoglaltE() == false) {
            foglalas = true;
            honapokSzama += lefoglalnikivantHonap;
        }
        else{
            foglalas = false;
        }
        return foglalas;
    }
    
    
}
