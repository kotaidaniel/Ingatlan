
import java.util.ArrayList;
import java.util.List;

public class Tarsashaz {
    public List<Ingatlan> lista;
    public int lakasSzam;
    public int garazsSzam;

    public Tarsashaz(List<Ingatlan> lista, int lakasSzam, int garazsSzam) {
        this.lista = new ArrayList<>();
        this.lakasSzam = 0;
        this.garazsSzam = 0;
    }
    public boolean lakasHozzaAd(Lakas l){
        boolean hozzaad = false; 
        lista.add(l);
        return hozzaad;
    }
    public boolean garazsHozzaAd(Garazs g){
        boolean hozzaad = false; 
        lista.add(g);
        return hozzaad;
    }
    
    
}
