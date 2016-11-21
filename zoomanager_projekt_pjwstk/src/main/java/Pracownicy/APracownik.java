/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pracownicy;

/**
 *
 * @author TKK
 */
public class APracownik {
    protected final String kod;
    protected final String imie;
    protected final String nazwisko;
    private static double pensja=1200; 

    public APracownik(String kod, String imie, String nazwisko) {
        this.kod = kod;
        this.imie = imie;
        this.nazwisko = nazwisko;
    }

    public static void setPensja(double pensja) {
        APracownik.pensja = pensja;
    }
    
    
}


