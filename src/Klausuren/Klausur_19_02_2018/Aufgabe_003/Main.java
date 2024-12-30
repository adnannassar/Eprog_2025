package Klausuren.Klausur_19_02_2018.Aufgabe_003;

public class Main {
    public static void main(String[] args) {
        int teilerCount = teileranzahl(15);
        if (teilerCount == 2) {
            System.out.println("Primzahl");
        } else {
            System.out.println("Keine Primzahl");
        }
    }

    public static int teileranzahl(int n) {
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                count++;
            }
        }
        return count;
    }
}
