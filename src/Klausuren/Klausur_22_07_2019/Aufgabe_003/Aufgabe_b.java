package Klausuren.Klausur_22_07_2019.Aufgabe_003;

public class Aufgabe_b {
    public static void main(String[] args) {
        int[] feld = {1, 7, 13, -5, 2, 27, 11, 4, 51};
        teilsumme(feld);
    }

    public static void teilsumme(int[] feld) {
        int[] erg = new int[feld.length];

        erg[0] = feld[0];

        for (int i = 1; i < feld.length; i++) {
            erg[i] = feld[i] + erg[i - 1];
        }

        printArray(erg);
    }

    public static void printArray(int[] feld) {
        for (int i = 0; i < feld.length; i++) {
            System.out.print(feld[i] + " ");
        }
        System.out.println();
    }
}
