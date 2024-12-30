package Klausuren.Klausur_22_07_2019.Aufgabe_002;

import java.util.Scanner;

public class GeradeWorte {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bitte geben Sie die Wörter ein: ");
        String[] words = new String[50];
        for (int i = 0; i < words.length; i++) {
            words[i] = scanner.next();
        }
        System.out.println("Die geraden Worte sind: ");
        for (int i = 0; i < words.length; i++) {
            if (words[i].length() % 2 == 0) {
                System.out.println(words[i]);
            }
        }

        System.out.println("Die ungeraden Worte sind: ");
        for (int i = 0; i < words.length; i++) {
            if (words[i].length() % 2 != 0) {
                System.out.println(words[i]);
            }
        }
    }
}
