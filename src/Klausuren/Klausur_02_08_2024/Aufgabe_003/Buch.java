package Klausuren.Klausur_02_08_2024.Aufgabe_003;

public abstract class Buch {
    private String thema;
    public String title;
    public String autor;

    public Buch(String title, String autor, String thema) {
        this.title = title;
        this.autor = autor;
        this.thema = thema;
    }

    public String getThema() {
        return thema;
    }

    public abstract  int getGewicht();

    public boolean inRegalLegen(Regal regal) {
        return regal.addBuch(this);
    }
}
