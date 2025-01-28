package Klausuren.Klausur_02_08_2024.Aufgabe_003;

public class Regal {
    public int anzahlBuecher;
    private int tragkraft;
    private String thema;
    private Buch[] buecher;

    public Regal(int tragkraft, String thema) {
        this.tragkraft = tragkraft;
        this.thema = thema;
        this.buecher = new Buch[10];
    }

    public boolean addBuch(Buch buch) {
        for (int i = 0; i < buecher.length; i++) {
            if (buecher[i] == null &&
                    passtThemaBuch(buch) &&
                    getFreiesGewicht() &&
                tragkraft >= buch.getGewicht()) {
                buecher[i] = buch;
                this.tragkraft -= buch.getGewicht();
                anzahlBuecher++;
                return true;
            }
        }
        return false;
    }

    private boolean passtThemaBuch(Buch einBuch) {
       if(this.thema.equals(einBuch.getThema())){
           return true;
       }else{
           return false;
       }
    }
    public boolean getFreiesGewicht(){
        if( tragkraft > 0 ){
            return true;
        }else{
            return false;
        }
    }

    public Buch getBuch(int index) {
        if(index >= 0 && index < buecher.length){
            return buecher[index];
        }
        return null;
    }

    public String getThema() {
        return thema;
    }
}
