public class Garazs implements Ingatlan, Berelheto{
    public int terulet;
    public int nmAr;
    public boolean futottE;
    public int honapSzama;
    public boolean auto;

    public Garazs(int terulet, int nmAr, boolean futottE, int honapSzama, boolean auto) {
        this.terulet = terulet;
        this.nmAr = nmAr;
        this.futottE = futottE;
        this.honapSzama = 0;
        this.auto = false;
    }
    
    @Override
    public double osszesKoltseg() {
        int koltseg = terulet * nmAr;        
        return koltseg;
    }

    @Override
    public double mennyibeKerul(int honapokszama) {
        double osszesKoltseg;
        if (futottE == true) {
            osszesKoltseg = osszesKoltseg() * 1.5;
        }
        return osszesKoltseg();
    }

    @Override
    public boolean lefoglaltE() {
        boolean foglal = false;
        if (honapSzama > 0) {
            foglal = true;
        }
        return foglal;
    }

    @Override
    public boolean lefoglal(int lefoglalnikivantHonap) {
        boolean foglal = false;
        if (lefoglaltE() == false) {
           honapSzama += lefoglalnikivantHonap;
        }
        return foglal;
    }
    
    public void autoKiBeAll(){
        if (auto == true) {
            this.auto = false;
        }
        else{
            this.auto = true;
        }
    }

    @Override
    public String toString() {
        return "Garazs{" + "terulet=" + terulet + ", nmAr=" + nmAr + ", futottE=" + futottE + ", honapSzama=" + honapSzama + ", auto=" + auto + '}';
    }
    
    
    
}
