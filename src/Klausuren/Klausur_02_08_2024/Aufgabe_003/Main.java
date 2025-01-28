package Klausuren.Klausur_02_08_2024.Aufgabe_003;

public class Main
{
    public static void main(String[] args) {
        Buch l1 = new Lexikon("Lexikon der Programmiersprachen", "Maria Male", "Informatik‐Lexikon");
        Buch b1 = new Bildband("Algorithmenkunst", "Maria Maler", 5);
        Buch b2 = new Bildband("Bilder von Sortieralgorithmen", "Maria Maler", 3);

        Regal regal1 = new Regal(100,"Informatik‐Lexikon" );
        Regal regal2 = new Regal(50,"Bildband" );
        Regal regal3 = new Regal(1200,"Bildband" );

        regal1.addBuch(l1);
        regal2.addBuch(b1);
        regal3.addBuch(b2);



        Bibliothek bibliothek = new Bibliothek();
        bibliothek.addRegal(regal1);
        bibliothek.addRegal(regal2);
        bibliothek.addRegal(regal3);


        bibliothek.findeAutor("Maria Maler");
        System.out.println();
        bibliothek.findeAutor("Markus Mayer");

    }
}
