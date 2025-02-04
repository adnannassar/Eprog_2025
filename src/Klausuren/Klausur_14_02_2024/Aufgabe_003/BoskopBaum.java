package Klausuren.Klausur_14_02_2024.Aufgabe_003;

public class BoskopBaum  extends Baum{

    public BoskopBaum(String derName) {
        super("BoskopBaum");
    }

    @Override
    public boolean pruefeObstsorte(Frucht eineFrucht) {
       if(eineFrucht instanceof Boskop){
           return true;
       }
       return false;
    }

}
