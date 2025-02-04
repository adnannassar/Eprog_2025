package Klausuren.Klausur_14_02_2024.Aufgabe_002;

public class Aufgabe_002 {
    /*
        1: 0
        2: 1
        3: 0, 1, 2
        4: 0, 1, 2
        5: 0, 1, 2
        7: 1
    * */
    public static void main(String[] args) {
        int[][] A = {
                {1, 3, 5, 4},    // zeile 0
                {2, 4, 7, 5, 3}, // zeile 1
                {5, 3, 4}        // zeile 2
        };

        auswertung(A);
    }

    // a)
    public static int maximum(int[][] feld) {
        int max = feld[0][0];
        for (int i = 0; i < feld.length; i++) {
            for (int j = 0; j < feld[i].length; j++) {
                if (feld[i][j] > max) {
                    max = feld[i][j];
                }
            }
        }
        return max;
    }

    // b)
    public static boolean enthaelt(int[] feld, int wert) {
        for (int i = 0; i < feld.length; i++) {
            if (feld[i] == wert) {
                return true;
            }
        }
        return false;
    }


    // c)
    /*
     1. Bestimme das Maximum des 2D-Feldes mit der Methode maximum().
     2. Iteriere über alle Werte von 0 bis zum Maximum.
     3. Für jeden Wert überprüfe mit enthaelt(), in welchen Zeilen der Wert vorkommt.
     4. Speichere die Zeilenindizes für jeden Wert.
     5. Gib die Zeilenindizes für jeden Wert auf der Konsole aus.
    */


    // d)
    public static void auswertung(int[][] feld) {
        int max = maximum(feld);
        for (int i = 0; i <= max; i++) {
            System.out.print(i + ": ");
            boolean first = true;
            for (int j = 0; j < feld.length; j++) {
                if (enthaelt(feld[j], i)) {
                    if (!first) {
                        System.out.print(", ");
                    }
                    System.out.print(j);
                    first = false;
                }
            }
            System.out.println();
        }
    }

}
