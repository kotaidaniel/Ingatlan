public class HazMester {
    public static List<Lakas> adatok;
    public static void main(String[] args) {
        karbantart("file.txt");
    }
    public static void karbantart(String file){
        Tarsashaz T;
        try{
            FileReader f= new FileReader(fileEleres);
            BufferedReader br= new BufferedReader(f);
            String sor= br.readLine();
            while (sor!=null){
                String[] st=sor.split(" ");
                if (st[0].equals("Alberlet")){
                    adatok.add(new Alberlet(st[1],st[2],st[3]));

                }else if (st[0].equals("CsaladiApartman")){
                    adatok.add(new CsaladiApartman(st[1],st[2],st[3]));

                }else if (st[0].equals("Garazs")){
                    adatok.add(new Garazs(st[1],st[2],st[3]));

                }
                sor=br.readLine();
            }
            br.close();
            f.close();
        }catch (FileNotFoundException e){
            System.out.println("Nem található a file");
        }catch (IOException e){
            System.out.println("Írás/olvasás/jogusulcsági hiba");
        }

    }
    }
    
}
