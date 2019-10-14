package ba.unsa.etf.rpr;

public class Artikl {

    private String naziv="";
    private int cijena=0;
    private String kod="";


    public Artikl(String naziv,int cijena,String kod){

        this.naziv=naziv;
        this.cijena=cijena;
        this.kod=kod;

    }


    public String getNaziv(){
        return naziv;
    }

    public int getCijena(){
        return cijena;
    }
    public String getKod(){
        return kod;
    }

    /*public Artikl(Artikl a){
        this.naziv=a.naziv;
        this.cijena=a.cijena;
        this.kod=a.kod;

    }*/

}
