package OOP.Vererbung.Abstract;

public class Arbeiter extends Mitarbeiter {
    private double stundenLohn;
    private double anzahlStunden;
    private double uebestundenZuschlag;
    private double anzahlUebestunden;

    public Arbeiter(String name, double stundenLohn, double anzahlStunden, double uebestundenZuschlag) {
        super(name);
        this.stundenLohn = stundenLohn;
        this.anzahlStunden = anzahlStunden;
        this.uebestundenZuschlag = uebestundenZuschlag;
    }

    public void setAnzahlUebestunden(double anzahlUebestunden) {
        this.anzahlUebestunden = anzahlUebestunden;
    }

    public double berechneGehalt() {
        return (stundenLohn * anzahlStunden) + (uebestundenZuschlag * anzahlUebestunden);
    }
}
