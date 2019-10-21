package ba.unsa.etf.rpr;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KorpaTest {

    Korpa k=new Korpa();

    @BeforeEach
    void setup(){
        k=new Korpa();
        for(int i=0;i<50;i++){
            k.dodajArtikl(new Artikl("Biciklo",1000,""+i));
        }


    }

    @Test
    void uzmiBrojArtikala() {

        assertEquals(k.getBrojArtikla(),50);
    }

    @Test
    void dodajNaPunuKorpu() {

        Artikl a=new Artikl("Biciklo",1500,"1");
        System.out.println("Broj artikala je "+k.getBrojArtikla());
        k.dodajArtikl(a);

        assertDoesNotThrow(()-> k.dodajArtikl(a));



    }

    @Test
    void izbaciPrazan() {
        Korpa k1=new Korpa();

        assertNotNull(k.izbaciArtiklSaKodom("1"));
    }

    @Test
    void izbaciIsti(){

        assertAll(
                ()->assertNotNull(k.izbaciArtiklSaKodom("40")),
                ()->assertNull(k.izbaciArtiklSaKodom("40"))
        );

    }

    @Test
    void dajUkupnuCijenuArtikala() {
        assertEquals(50000,k.dajUkupnuCijenuArtikala());
    }
}