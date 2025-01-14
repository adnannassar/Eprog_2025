package OOP.Assosiation.RaumverwaltungExample;

public class Raumverwaltung {
    private Raum[] raeume;

    public Raumverwaltung() {
        raeume = new Raum[100];
    }

    public void addRaum(Raum raum) {
        for (int i = 0; i < raeume.length; i++) {
            if (raeume[i] == null) {
                raeume[i] = raum;
                break;
            }
        }
    }

    public void ausgabeRaumliste() {
        for (int i = 0; i < raeume.length; i++) {
            if (raeume[i] != null) {
                System.out.print(raeume[i].getTrakt() + "." + raeume[i].getEtage() + "." + raeume[i].getNummer());
                if (raeume[i].getNutzer() != null) {
                    System.out.print(": " + raeume[i].getNutzer().getName());
                }
                System.out.println();
            }

        }
    }


}
