package Klausuren.Klausur_19_02_2018.Aufgabe_002;

import java.util.Scanner;

public class Auswahl {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();
        int n3 = scanner.nextInt();
        int n4 = scanner.nextInt();
        int n5 = scanner.nextInt();
        int n6 = scanner.nextInt();
        int n7 = scanner.nextInt();
        int n8 = scanner.nextInt();
        int n9 = scanner.nextInt();


        int auswahl;
        do {
            zeigeMenue();
            System.out.print("Bitte wählen Sie eine Option: ");
            auswahl = scanner.nextInt();

            switch (auswahl) {
                case 1:
                    System.out.println("Die 1. bis 7. eingegebene Zahl: " + n1 + ", " + n2 + ", " + n3 + ", " + n4 + ", " + n5 + ", " + n6 + ", " + n7);
                    break;
                case 2:
                    System.out.println("Die achte eingegebene Zahl: " + n8);
                    break;
                case 3:
                    System.out.println("Die neunte eingegebene Zahl: " + n9);
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
