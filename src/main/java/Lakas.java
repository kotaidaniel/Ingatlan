public abstract class Lakas implements Ingatlan{
    protected int terulet;
    protected double szobakSzama;
    protected int lakok;
    protected int nmAr;

    public Lakas(int terulet, double szobakSzama, int lakok, int nmAr) {
        this.terulet = terulet;
        this.szobakSzama = szobakSzama;
        this.lakok = lakok;
        this.nmAr = nmAr;
    }
    
    public abstract boolean bekoltozik(int lakok);

    @Override
    public double osszesKoltseg() {
        double osszKoltseg = terulet * nmAr;
        return osszKoltseg;
    }
    
    public int lakokSzama(){
        return lakok;
    }

    @Override
    public String toString() {
        return "Lakas{" + "terulet=" + terulet + ", szobakSzama=" + szobakSzama + ", lakok=" + lakok + ", nmAr=" + nmAr +'}';
    }
    
    
}
