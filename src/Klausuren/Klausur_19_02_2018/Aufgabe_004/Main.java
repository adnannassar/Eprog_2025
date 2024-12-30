package Klausuren.Klausur_19_02_2018.Aufgabe_004;

public class Main {
    public static void main(String[] args) {
        int[][] feld = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12}
        };
        System.out.println("Aufgabe a: ");
        System.out.println("Original:");
        printArray(feld);
        System.out.println("......................");
        int[][] transponierte = berechneTransponierte(feld);
        System.out.println("Transponierte:");
        printArray(transponierte);


        System.out.println("\n\nAufgabe b: ");
        int[][] feld2 = {
                {1, 2, 3, 4},
                {2, 1, 5, 5},
                {3, 5, 9, 9},
                {4, 5, 9, 8}
        };

        System.out.println("Feld 2: ");
        printArray(feld2);
        System.out.println("Ist Feld 2 Symmetrisch?  -->  " + istSymmetrisch(feld2));


    }

    public static int[][] berechneTransponierte(int[][] feld) {
        int[][] erg = new int[feld[0].length][feld.length];
        for (int i = 0; i < feld.length; i++) {
            for (int j = 0; j < feld[i].length; j++) {
                erg[j][i] = feld[i][j];
            }
        }
        return erg;
    }

    public static boolean sindIdentisch(int[][] feld1, int[][] feld2) {
        for (int i = 0; i < feld1.length; i++) {
            for (int j = 0; j < feld1[i].length; j++) {
                if (feld1[i][j] != feld2[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean istSymmetrisch(int[][] feld) {
        int[][] transponierte = berechneTransponierte(feld);
        boolean erg = sindIdentisch(feld, transponierte);
        if (erg == true) {
            return true;
        } else {
            return false;
        }
    }

    public static void printArray(int[][] feld) {
        for (int i = 0; i < feld.length; i++) {
            for (int j = 0; j < feld[i].length; j++) {
                System.out.print(feld[i][j] + " ");
            }
            System.out.println();
        }
    }
}
