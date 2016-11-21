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
    protected double pensja; 

    public APracownik(String kod, String imie, String nazwisko, double pensja) {
        this.kod = kod;
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.pensja = 1200;
    }
    
}
