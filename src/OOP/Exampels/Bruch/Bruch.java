package OOP.Exampels.Bruch;

public class Bruch {
    private int zaehler;
    private int nenner;


    public Bruch() {
        this.zaehler = 1;
        this.nenner = 1;
    }

    public Bruch(int zaehler, int nenner) {
        this.zaehler = zaehler;
        this.nenner = nenner;
    }

    public int getZaehler() {
        return zaehler;
    }

    public int getNenner() {
        return nenner;
    }

    public Bruch kehrwert() {
      Bruch erg = new Bruch(this.nenner , this.zaehler);
      return erg;
    }

    public Bruch addieren(Bruch b) {
        return null;
    }

    public Bruch multiplizieren(Bruch b) {
        return null;
    }

    public void printBruch(){
        System.out.println(this.zaehler + "/" + this.nenner);
    }

    // TODO toString
}
