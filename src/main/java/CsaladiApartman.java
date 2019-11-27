public class CsaladiApartman extends Lakas{
    public int gyerekekSzama;
    public CsaladiApartman(int terulet, double szobakSzama, int lakok, int nmAr, int gyerekekSzama) {
        super(terulet, szobakSzama, lakok, nmAr);
        this.gyerekekSzama = gyerekekSzama;
    }

    @Override
    public boolean bekoltozik(int lakok) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public boolean gyerekSzuletik(){
        boolean szuletik;
        if (super.lakok >= 2) {
            super.lakok += 1;
            gyerekekSzama += 1;
            szuletik = true;
        }
        else{
            szuletik = false;
        }
        return szuletik;
    }
    
}
