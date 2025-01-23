package Klausuren.PropeKlausur.Aufgabe_007;

public class Main {
    public static void main(String[] args) {
        Wohnraum wohnraum = new Wohnraum("Wohnzimmer", 5, 4, 2);
        Wohnraum wohnraum2 = new Wohnraum("Schlafzimmer", 4, 3, 1);
        Wohnraum wohnraum3 = new Wohnraum("Küche", 3, 3, 1);
        Wohnraum wohnraum4 = new Wohnraum("Badezimmer", 2, 2, 1);

        Garage garage = new Garage("Garage", 6, 5, 1);
        Garage garage2 = new Garage("Carport", 5, 4, 2);
        Garage garage3 = new Garage("Schuppen", 4, 3, 1);
        Garage garage4 = new Garage("Gartenhaus", 3, 3, 0);

        Gebäude gebäude = new Gebäude("Haus", 400);

        gebäude.addRaum(wohnraum);
        gebäude.addRaum(wohnraum2);
        gebäude.addRaum(wohnraum3);
        gebäude.addRaum(wohnraum4);

        gebäude.addRaum(garage);
        gebäude.addRaum(garage2);
        gebäude.addRaum(garage3);
        gebäude.addRaum(garage4);

        System.out.println("Fläche des Hauses: " + gebäude.getGesamtfläche());

        System.out.println("Anzahl der Räume im Haus: " + gebäude.getAnzahlRäume());

        System.out.println("Gesamte Raum Fläche: " + gebäude.berechneRaumfläche());

        System.out.println("Anzahl der Wohnräume: " + gebäude.berechneWohnfläche());

    }
}
