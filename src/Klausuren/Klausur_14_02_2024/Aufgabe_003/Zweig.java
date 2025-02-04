package Klausuren.Klausur_14_02_2024.Aufgabe_003;

public class Zweig {
    private Frucht[] fruechte;
    private Blatt[] blätter;
    private Stamm stamm;

    public Zweig() {
        this.fruechte = new Frucht[10];
        this.blätter = new Blatt[8];
    }

    private void setStamm(Stamm stamm) {
        this.stamm = stamm;
    }

    public Stamm getStamm() {
        return stamm;
    }

    public boolean addFrucht(Frucht frucht) {
        for (int i = 0; i < fruechte.length; i++) {
            if (fruechte[i] == null) {
                fruechte[i] = frucht;
               return true;
            }
        }
        return false;
    }

    public int getAnzahlFruechte() {
        int count = 0;
        for (int i = 0; i < fruechte.length; i++) {
            if (fruechte[i] != null) {
                count++;
            }
        }
        return count;
    }

    public boolean addBlatt(Blatt blatt) {
        for (int i = 0; i < blätter.length; i++) {
            if (blätter[i] == null) {
                blätter[i] = blatt;
                return true;
            }
        }
        return false;
    }

    public int getAnzahlBlätter() {
        int count = 0;
        for (int i = 0; i < blätter.length; i++) {
            if (blätter[i] != null) {
                count++;
            }
        }
        return count;
    }

}
