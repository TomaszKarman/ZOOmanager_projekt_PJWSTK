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
public class PracownikTechniczny extends APracownik{
    private String kod;
    private String imie;
    private String nazwisko;
    private double pensja;

    public PracownikTechniczny(String kod, String imie, String nazwisko) {
        super(kod, imie, nazwisko);
    }
    
    
    
    private void naprawWybieg ( wybieg.Wybieg wybieg) {
    }
    
}
