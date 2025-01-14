package OOP.Vererbung.PersonExample;

public class Mitarbeiter extends Person {
    // Mitarbeiter has a name and age from Person

    private String büroNummer;

    public Mitarbeiter(String name, int age, String büroNummer) {
        super(name, age);
        this.büroNummer = büroNummer;
    }

    public String getBüroNummer() {
        return büroNummer;
    }

    public void setBüroNummer(String büroNummer) {
        this.büroNummer = büroNummer;
    }
}
