package Klausuren.Klausur_19_02_2018.Aufgabe_002;

import java.util.Scanner;

public class Auswahl_Lösung_Mit_Array {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] zahlen = new int[9];
        for (int i = 0; i < zahlen.length; i++) {
            System.out.print("Bitte geben Sie die " + (i + 1) + ". Zahl ein: ");
            zahlen[i] = scanner.nextInt();
        }
        int auswahl;
        do {
            zeigeMenue();
            System.out.print("Bitte wählen Sie eine Option: ");
            auswahl = scanner.nextInt();
            switch (auswahl) {
                case 1:
                    System.out.println("Die 1. bis 7. eingegebene Zahl: ");
                    for (int i = 0; i < 7; i++) {
                        System.out.print(zahlen[i] + " ");
                    }
                    break;
                case 2:
                    System.out.println("Die achte eingegebene Zahl: " + zahlen[8]);
                    break;
                case 3:
                    System.out.println("Die neunte eingegebene Zahl: " + zahlen[9]);
                    break;
                case 4:
                    System.out.println("Das Programm wird beendet.");
                    break;
                default:
                    System.out.println("Ungültige Eingabe.");
            }
        } while (auswahl != 4);

    }

    public static void zeigeMenue() {
        System.out.println("(1) Zeige die 1. bis 7. eingegebene Zahl");
        System.out.println("(2) Zeige die achte eingegebene Zahl");
        System.out.println("(3) Zeige die neunte eingegebene Zahl");
        System.out.println("(4) Beende das Programm");
    }
}
