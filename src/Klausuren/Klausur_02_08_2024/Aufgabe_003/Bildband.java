package Klausuren.Klausur_02_08_2024.Aufgabe_003;

public class Bildband extends Buch {
    private int gewicht;

    public Bildband(String title, String autor, int gewicht) {
        super(title, autor, "Bildband");
        this.gewicht = gewicht;
    }

    @Override
    public int getGewicht() {
        return gewicht;
    }
}
