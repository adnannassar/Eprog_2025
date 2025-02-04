package Klausuren.Klausur_14_02_2024.Aufgabe_003;

public class MirabellenBaum extends Baum {

    public MirabellenBaum(String derName) {
        super(derName);
    }

    @Override
    public boolean pruefeObstsorte(Frucht eineFrucht) {
        if (eineFrucht instanceof Mirabelle) {
            return true;
        }
        return false;
    }

}
