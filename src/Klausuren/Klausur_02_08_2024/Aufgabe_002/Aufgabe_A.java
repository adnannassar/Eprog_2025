package Klausuren.Klausur_02_08_2024.Aufgabe_002;

public class Aufgabe_A {
    public static void main(String[] args) {
        boolean[][] R1 = {
                {false, true, true},
                {true, false, true},
                {true, true, false}
        };

        boolean[][] R2 = {
                {true, true, true},
                {false, true, true},
                {false, false, true}
        };

        boolean[][] R3 = {
                {true, false, false, true},
                {false, true, true, false},
                {false, true, true, false},
                {true, false, false, true},
        };


        System.out.println("ist_reflexiv R1  --> : " + ist_reflexiv(R1)); // false
        System.out.println("ist_reflexiv R2  --> : " + ist_reflexiv(R2)); // true
        System.out.println("ist_reflexiv R3  --> : " + ist_reflexiv(R3)); // true


        System.out.println("\nist_symmetrisch R1  --> : " + ist_symmetrisch(R1)); // true
        System.out.println("ist_symmetrisch R2  --> : " + ist_symmetrisch(R2)); // false
        System.out.println("ist_symmetrisch R3  --> : " + ist_symmetrisch(R3)); // true

        System.out.println("\nist_antisymmetrisch R1  --> : " + ist_antisymmetrisch(R1)); // false
        System.out.println("ist_antisymmetrisch R2  --> : " + ist_antisymmetrisch(R2)); // true
        System.out.println("ist_antisymmetrisch R3  --> : " + ist_antisymmetrisch(R3)); // false

    }


    public static boolean ist_reflexiv(boolean[][] R) {
        for (int i = 0; i < R.length; i++) {
            for (int j = 0; j < R[i].length; j++) {
                if (i == j && R[i][j] == false) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean ist_symmetrisch(boolean[][] R) {
        for (int i = 0; i < R.length; i++) {
            for (int j = 0; j < R[i].length; j++) {
                if(R[i][j] != R[j][i]){
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean ist_antisymmetrisch(boolean[][] R) {
        for (int i = 0; i < R.length; i++) {
            for (int j = 0; j < R[i].length; j++) {
                if( i != j  && R[i][j] == R[j][i]){
                    return false;
                }
            }
        }
        return true;
    }
}
