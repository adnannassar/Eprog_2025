package Klausuren.Klausur_02_08_2024.Aufgabe_003;


public class Lexikon extends Buch {
    public Lexikon(String title, String autor, String thema) {
        super(title, autor, thema);
    }

    @Override
    public int getGewicht() {
        return 7;
    }
}
