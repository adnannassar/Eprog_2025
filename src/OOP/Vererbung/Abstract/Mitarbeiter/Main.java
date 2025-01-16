package OOP.Vererbung.Abstract.Mitarbeiter;

public class Main {
    public static void main(String[] args) {
        Firma firma = new Firma();
        Arbeiter arbeiter = new Arbeiter("Max", 10, 20, 5);
        Angestellter angestellter  = new Angestellter("Moritz", 2000, 100, 50);
        Manager manager = new Manager("Muster", 3000, 200);
        Geschaeftsfuehrer geschaeftsfuehrer = new Geschaeftsfuehrer("Muster", 4000, 300, 100);

        firma.addMitarbeiter(arbeiter);
        firma.addMitarbeiter(angestellter);
        firma.addMitarbeiter(manager);
        firma.addMitarbeiter(geschaeftsfuehrer);

        System.out.println(firma.berechneJahresKosten());
    }
}
