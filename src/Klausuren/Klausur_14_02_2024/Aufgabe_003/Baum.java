package Klausuren.Klausur_14_02_2024.Aufgabe_003;


public abstract class Baum {
    private Stamm stamm;
    private Obstwiese dieWiese;
    protected String dieSorte;

    public Baum(String baumName) {
        this.dieSorte = baumName;
        this.stamm = new Stamm(dieSorte, this);
    }

    public void setWiese(Obstwiese dieWiese) {
        this.dieWiese = dieWiese;
    }

    public String getSorte() {
        return dieSorte;
    }

    public Stamm getStamm() {
        return stamm;
    }

    public abstract boolean pruefeObstsorte(Frucht eineFrucht);

    public void countBlaetterUndFruechte() {
        int anzahlBlaetter = 0;
        int anzahlFruechte = 0;
        int anzahlZweige = stamm.getAnazhlZweige();
        for (int i = 0; i < anzahlZweige; i++) {
            Zweig zweig = stamm.getZweig(i);
            if (zweig != null) {
                anzahlBlaetter += zweig.getAnzahlBlätter();
                anzahlFruechte += zweig.getAnzahlFruechte();
            }
        }
        System.out.println("Anzahl Blaetter "+anzahlBlaetter);
        System.out.println("Anzahl Fruechte "+anzahlFruechte);
    }
}
