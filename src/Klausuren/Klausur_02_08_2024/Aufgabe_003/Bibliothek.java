package Klausuren.Klausur_02_08_2024.Aufgabe_003;

public class Bibliothek {
    private Regal[] regale;

    public Bibliothek() {
        this.regale = new Regal[5];
    }

    public boolean addRegal(Regal regal) {
        for (int i = 0; i < regale.length; i++) {
            if (regale[i] == null) {
                regale[i] = regal;
                return true;
            }
        }
        return false;
    }

    public Regal getRegal(int index) {
        if (index >= 0 && index < regale.length) {
            return regale[index];
        }
        return null;
    }

    public int getAnzahlRegale() {
        int counter = 0;
        for (int i = 0; i < regale.length; i++) {
            if (regale[i] != null) {
                counter++;
            }
        }
        return counter;
    }

    public void findeAutor(String derAutor) {
        System.out.println("Suche nach " + derAutor);
        boolean gefunden = false;
        for (int i = 0; i < regale.length; i++) {
            if (regale[i] != null) {
                for (int j = 0; j < regale[i].anzahlBuecher; j++) {
                    if (regale[i].getBuch(j).autor.equals(derAutor)) {
                        System.out.println("Buch Title: " + regale[i].getBuch(j).title
                                + " im Regalthema: " + regale[i].getThema());
                        gefunden = true;
                    }
                }
            }
        }
        if (!gefunden) {
            System.out.println("Kein passendes Buch gefunden.");
        }
    }

}
