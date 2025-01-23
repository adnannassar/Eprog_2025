package Klausuren.PropeKlausur.Aufgabe_004;

public class Muster {
    private char[][] feld;

    public Muster(int n) {
        if (n < 5) {
            feld = new char[5][9];
        } else {
            if (n % 2 != 0) {
                feld = new char[n][2 * n - 1];
            } else {
                feld = new char[n + 1][2 * n + 1];
            }
        }
    }
    public void fülleArray(){
        for (int i = 0; i < feld.length; i++) {
            for (int j = 0; j < feld[i].length; j++) {
                if (i + j == feld.length - 1 || j - i == feld.length - 1) {
                    feld[i][j] = '*';
                } else if (i == feld.length / 2 && j > feld.length / 2 && j < feld.length + 1) {
                    feld[i][j] = '*';
                } else {
                    feld[i][j] = ' ';
                }
            }
        }
    }
}
