package ba.unsa.etf.rpr;

public class Artikl {

    String naziv="";
    double cijena=0;
    String kod="";


    public Artikl(String naziv,double cijena,String kod){

        this.naziv=naziv;
        this.cijena=cijena;
        this.kod=kod;
    }

    public Artikl(){

        this.naziv="";
        this.cijena=0;
        this.kod="";
    }

    String getNaziv(){
        return naziv;
    }

    double getCijena(){
        return cijena;
    }
    String getKod(){
        return kod;
    }

}
