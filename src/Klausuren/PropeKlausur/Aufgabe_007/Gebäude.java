package Klausuren.PropeKlausur.Aufgabe_007;

public class Gebäude {
    private String adresse;
    private float gesamtfläche;
    private Raum[] räume;

    public Gebäude(String adresse, float gesamtfläche) {
        this.räume = new Raum[10];
        this.adresse = adresse;
        this.gesamtfläche = gesamtfläche;
    }

    public float getGesamtfläche() {
        return gesamtfläche;
    }

    public int getAnzahlRäume() {
        int count = 0;
        for (int i = 0; i < räume.length; i++) {
            if (räume[i] != null) {
                count++;
            }
        }
        return count;
    }

    public boolean addRaum(Raum raum) {
        for (int i = 0; i < räume.length; i++) {
            if (räume[i] == null) {
                räume[i] = raum;
                return true;
            }
        }
        return false;
    }



    public float berechneRaumfläche() {
        float gesamtfläche = 0;
        for (int i = 0; i < räume.length; i++) {
            if (räume[i] != null) {
                gesamtfläche += räume[i].berechneFläche();
            }
        }
        return gesamtfläche;
    }

    public float berechneWohnfläche() {
        float gesamteWohnfläche = 0;
        for (int i = 0; i < räume.length; i++) {
            if (räume[i] != null && räume[i] instanceof Raum) {
                    gesamtfläche += räume[i].berechneFläche();
            }
        }
        return gesamteWohnfläche;
    }
}
