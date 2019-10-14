package ba.unsa.etf.rpr;

public class Artikl {

    private String naziv="";
    private double cijena=0;
    private String kod="";


    public Artikl(String naziv,double cijena,String kod){

        this.naziv=naziv;
        this.cijena=cijena;
        this.kod=kod;
    }


    public String getNaziv(){
        return naziv;
    }

    public double getCijena(){
        return cijena;
    }
    public String getKod(){
        return kod;
    }

}
