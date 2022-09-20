package hu.petrik.oop.emberek;

import java.time.LocalDate;

public class Ember {
    private String nev;
    private String szulDatum;
    private String szulHely;

    public Ember(String nev, String szulDatum, String szulHely) {
        this.nev = nev;
        this.szulDatum = szulDatum;
        this.szulHely = szulHely;
    }

    public int getSzuletesiEV() {
        return Integer.parseInt(szulDatum.substring(0, 4));
    }

    public int getSzuletesiHonap() {
        return Integer.parseInt(szulDatum.split("-")[1]);
    }

    public int getSzuletesiNap() {
        return Integer.parseInt(szulDatum.split("-")[2]);
    }

    public int getEletkor() {
        LocalDate maiDatum = LocalDate.now();
        if (maiDatum.getMonthValue()<=this.getSzuletesiHonap()){
            return maiDatum.getYear() - this.getSzuletesiEV() - 1;
        } else if (maiDatum.getMonthValue()==this.getSzuletesiHonap() && maiDatum.getDayOfMonth()>=this.getSzuletesiNap()){
            return maiDatum.getYear() - this.getSzuletesiEV();
        }else

        return maiDatum.getYear() - this.getSzuletesiEV();
    }

    @Override
    public String toString() {
        return String.format("%-30s %10s (%d) %20s", this.nev, this.szulDatum, this.getEletkor(), this.szulHely);
    }
}
