package OOP.Exampels.Dozent;

public class Dozent {
    String name;
    String lehrgebiet;
    boolean dekan = false;
    char geschlecht;


    public Dozent(String name, String lehrgebiet, char geschlecht) {
        this.name = name;
        this.lehrgebiet = lehrgebiet;
        this.geschlecht = geschlecht;
    }

    // Setters
    void setName(String name) {
        this.name = name;
    }

    void setLehrgebiet(String lehrgebiet) {
        this.lehrgebiet = lehrgebiet;
    }

    void setDekan(boolean dekan) {
        this.dekan = dekan;
    }

    void setGeschlecht(char geschlecht) {
        this.geschlecht = geschlecht;
    }

    String getName() {
        return name;
    }

    String getLehrgebiet() {
        return lehrgebiet;
    }

    boolean isDekan() {
        return dekan;
    }

    char getGeschlecht() {
        return geschlecht;
    }
}
