package Klausuren.PropeKlausur.Aufgabe_007;

public class Garage extends Raum {
    private int anzahlTüren;

    public Garage(String bezeichnung, float länge, float breite, int anzahlTüren) {
        super(bezeichnung, länge, breite);
        this.anzahlTüren = anzahlTüren;
    }

    public int getAnzahlTüren() {
        return anzahlTüren;
    }
}
