package Klausuren.PropeKlausur.Aufgabe_006;

public class InternetRadio extends Gerät implements IPGerät {
    private Sender[] favoritenListe;
    private String ipAddress;

    public InternetRadio(int id, String hersteller, String ipAddress) {
        super(id, hersteller);
        this.favoritenListe = new Sender[100]; // {null, null ... null}
        this.ipAddress = ipAddress;
    }

    public int getAnzahlFavotiten() {
        int counter = 0;
        for (int i = 0; i < favoritenListe.length; i++) {
            if (favoritenListe[i] != null) {
                counter++;
            }
        }
        return counter;
    }

    // soll den ersten Eintrag in der favoritenliste löschen ohne lücken!
    public boolean removeFavorite() {
        // if array is empty
        if (favoritenListe[0] == null) {
            return false;
        } else {
            for (int i = 0; i < favoritenListe.length - 1; i++) {
                favoritenListe[i] = favoritenListe[i + 1];
            }
            return true;
        }
    }

    public Sender getFavorite(int index) {
        if (index < 0 || index >= favoritenListe.length) {
            return null;
        }
        return favoritenListe[index];
    }

    public int addFavorite(String bezeichnung, String genre) {
        for (int i = 0; i < favoritenListe.length; i++) {
            if (favoritenListe[i] == null) {
                favoritenListe[i] = new Sender(bezeichnung, genre);
                return i;
            }
        }
        return -1;
    }

    public void ausgabeFavoriten(){
        for (int i = 0; i < favoritenListe.length; i++) {
            if (favoritenListe[i] != null) {
                System.out.println(favoritenListe[i].getBezeichnung() + " " + favoritenListe[i].getGenre());
            }
        }
    }

    @Override
    public String getIPAddress() {
        return "";
    }
}
