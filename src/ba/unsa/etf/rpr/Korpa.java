package ba.unsa.etf.rpr;

public class Korpa {

     Artikl[] korpa=new Artikl[50];
     int brojArtikla=0;


public Artikl[] getArtikli(){


    return this.korpa;

}

    public void dodajArtikl(Artikl a){

        if(brojArtikla==50) System.out.println("Korpa je puna");

    else {
            korpa[brojArtikla] = a;
            brojArtikla = brojArtikla + 1;
        }

    }


}
