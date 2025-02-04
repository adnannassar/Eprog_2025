package Klausuren.Klausur_14_02_2024.Aufgabe_003;

public class Stamm {
    private Zweig[] zweige;
    private Baum baum;
    private String baumName;

    public Stamm(String derName, Baum derBaum){
        this.baum = derBaum;
        this.baumName = derName;
        this.zweige = new Zweig[5];
    }

    public Baum getBaum(){
        return this.baum;
    }

    public boolean addZweig(Zweig einZweig){
        for (int i = 0; i < this.zweige.length; i++) {
            if (this.zweige[i] == null) {
                this.zweige[i] = einZweig;
                return true;
            }
        }
        return false;
    }

    public Zweig getZweig(int index){
        if (index >= 0 && index < this.zweige.length) {
            return this.zweige[index];
        }
        return null;
    }

    public int getAnazhlZweige(){
        int count = 0;
        for (int i = 0; i < this.zweige.length; i++) {
            if (this.zweige[i] != null) {
                count++;
            }
        }
        return count;
    }

}
