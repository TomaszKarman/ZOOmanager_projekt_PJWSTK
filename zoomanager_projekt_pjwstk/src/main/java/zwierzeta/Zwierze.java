/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zwierzeta;

import java.util.List;

/**
 *
 * @author TKK
 */
public class Zwierze {

    private String kod;
    private String nazwa;
    private static final int MAX_NAJEDZENIE = 100;
    private int tempoJedzenia;
    private Integer poziomNajedzenia;
    private List<RodzajJedzenia> rodzajJedzenia;

    public Zwierze(String kod, String nazwa, int tempoJedzenia, List<RodzajJedzenia> rodzajJedzenia, int poziomNajedzenia) {
        this.kod = kod;
        this.nazwa = nazwa;
        this.tempoJedzenia = tempoJedzenia;
        this.rodzajJedzenia = rodzajJedzenia;
        this.poziomNajedzenia = poziomNajedzenia;
    }

    public boolean jedz(Integer ilosc, RodzajJedzenia jedzenie) {
        // sprawdzam poziom najedzenia i rodzaj jedzenia
        if (poziomNajedzenia < MAX_NAJEDZENIE) {
            if (rodzajJedzenia.contains(jedzenie)) {
//                poziomNajedzenia = (poziomNajedzenia + ilosc)/(MAX_NAJEDZENIE+1);
                if (poziomNajedzenia + ilosc > MAX_NAJEDZENIE) {
                    poziomNajedzenia = MAX_NAJEDZENIE;
                } else {
                    poziomNajedzenia = poziomNajedzenia + ilosc;
                }
                return true;
            }

        }
        return false;

    }

    public double getPoziomNajedzenia() {
        return poziomNajedzenia / MAX_NAJEDZENIE;
    }
    

}
