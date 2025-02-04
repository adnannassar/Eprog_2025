package Klausuren.Klausur_14_02_2024.Aufgabe_003;

public class Main {
    public static void main(String[] args) {
        Obstwiese obstwiese = new Obstwiese("Kim Lauenroth");

        BoskopBaum boskopBaum = new BoskopBaum("Boskop Baum");
        Zweig boskopZweig_1 = new Zweig();
        boskopZweig_1.addBlatt(new Blatt());
        boskopZweig_1.addFrucht(new Boskop("Rote Boskop"));
        boskopZweig_1.addFrucht(new Boskop("Grüne Boskop"));
        Zweig boskopZweig_2 = new Zweig();
        boskopZweig_2.addBlatt(new Blatt());
        boskopBaum.getStamm().addZweig(boskopZweig_1);
        boskopBaum.getStamm().addZweig(boskopZweig_2);


        MirabellenBaum mirabellenBaum = new MirabellenBaum("Mirabellen Baum");
        Zweig mirabellenZweig_1 = new Zweig();
        mirabellenZweig_1.addFrucht(new Mirabelle("Gelbe Mirabelle"));
        Zweig mirabellenZweig_2 = new Zweig();
        mirabellenBaum.getStamm().addZweig(mirabellenZweig_1);
        mirabellenBaum.getStamm().addZweig(mirabellenZweig_2);


        obstwiese.addBaum(boskopBaum);
        obstwiese.addBaum(mirabellenBaum);

    }
}
