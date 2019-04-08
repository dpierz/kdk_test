package pl.kobietydokodu.nauka.daria;
//Utwórz klasę Kot . Klasa ta powinna mieć następujące pola:
//
//imię (ciąg znaków)
//data urodzenia (data)
//waga (liczba zmiennoprzecinkowa)
//imię opiekuna (ciąg znaków)
//Klasa ta powinna też mieć jedną metodę o nazwie przedstawSie.
// Metoda ta nie przyjmuje żadnych argumentów i zwraca ciąg znaków który jest
// zdaniem zawierającym imię kotka, jego datę urodzenia, wagę oraz imię opiekuna.

import java.util.Date;

public class Kot {
    private String imie;
    private Date dataUrodzenia;
    private Float waga;
    private String imieOpiekuna;

    public String przedstawSie(){
        return "Cześć, mam na imię "+ imie + " urodziłem się "+dataUrodzenia+ " ważę "+ waga + " mój opiekun ma na imię "+ imieOpiekuna +".";
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public Date getDataUrodzenia() {
        return dataUrodzenia;
    }

    public void setDataUrodzenia(Date dataUrodzenia) {
        this.dataUrodzenia = dataUrodzenia;
    }

    public Float getWaga() {
        return waga;
    }

    public void setWaga(Float waga) {
        this.waga = waga;
    }

    public String getImieOpiekuna() {
        return imieOpiekuna;
    }

    public void setImieOpiekuna(String imieOpiekuna) {
        this.imieOpiekuna = imieOpiekuna;
    }
}
