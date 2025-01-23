package Klausuren.PropeKlausur.Aufgabe_006;

public class Main {
    public static void main(String[] args) {
        InternetRadio internetRadio = new InternetRadio(1, "Sony", "192.162.13.01");

        internetRadio.addFavorite("RTL", "Unterhaltung");
        internetRadio.addFavorite("ZDF", "Dokumentation");
        internetRadio.addFavorite("ARD", "Nachrichten");
        internetRadio.addFavorite("Pro7", "Unterhaltung");
        internetRadio.addFavorite("Sat1", "Sport");

        internetRadio.ausgabeFavoriten();

        internetRadio.removeFavorite();

        System.out.println("\nAfter removing the first favorite (RTL Unterhaltung): \n");
        internetRadio.ausgabeFavoriten();

        System.out.println("\nNumber of favorites: " + internetRadio.getAnzahlFavotiten());

        System.out.println("\nGetting the favorite at index 2: ");
        System.out.println(internetRadio.getFavorite(2).getBezeichnung() + " " + internetRadio.getFavorite(2).getGenre());

    }
}
