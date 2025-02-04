package Klausuren.Klausur_14_02_2024.Aufgabe_003;

public abstract class Frucht {
    protected String dieSorte;

    public Frucht(String dieSorte) {
        this.dieSorte = dieSorte;
    }

    public abstract String getGeschmack();
}
