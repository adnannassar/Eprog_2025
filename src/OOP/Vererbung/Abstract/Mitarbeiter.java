package OOP.Vererbung.Abstract;

public class Mitarbeiter {
    private String name;
    private int personalNummer;
    private static int anzahlMitarbeiter;

    public Mitarbeiter(String name) {
        this.name = name;
        this.personalNummer = ++anzahlMitarbeiter;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPersonalNummer() {
        return personalNummer;
    }
}
