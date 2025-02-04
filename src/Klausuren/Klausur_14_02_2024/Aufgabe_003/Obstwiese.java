package Klausuren.Klausur_14_02_2024.Aufgabe_003;

public class Obstwiese {
    private Baum[] baeume;
    private String imBesitzVon;

    public Obstwiese(String imBesitzVon) {
        this.baeume = new Baum[10];
        this.imBesitzVon = imBesitzVon;
    }

    public boolean addBaum(Baum baum) {
        for (int i = 0; i < baeume.length; i++) {
            if (baeume[i] == null) {
                baeume[i] = baum;
                return true;
            }
        }
        return false;
    }
}
