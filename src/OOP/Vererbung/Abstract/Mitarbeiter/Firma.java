package OOP.Vererbung.Abstract.Mitarbeiter;

public class Firma {
    private Mitarbeiter[] mitarbeiter;

    public Firma() {
        this.mitarbeiter = new Mitarbeiter[1000];
    }

    public void addMitarbeiter(Mitarbeiter m) {
        for (int i = 0; i < mitarbeiter.length; i++) {
            if (mitarbeiter[i] == null) {
                mitarbeiter[i] = m;
                break;
            }
        }
    }

    public double berechneJahresKosten() {
        double sum = 0;
        for (int i = 0; i < mitarbeiter.length; i++) {
            if (mitarbeiter[i] != null) {
                sum += mitarbeiter[i].berechneGehalt();
            }
        }
        return sum * 12;
    }
}
