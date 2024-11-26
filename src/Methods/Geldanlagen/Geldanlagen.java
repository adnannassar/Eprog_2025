package Methods.Geldanlagen;

import java.util.Scanner;

public class Geldanlagen {
    static Scanner scanner = new Scanner(System.in);
    static int laufzeit;
    static double anlagebetrag;


    public static void main(String[] args) {
        getAnlagebetragUndLaufzeit();
        showMenu();
    }

    public static void showMenu() {
        int auswahl;
        do {
            System.out.println("........................................");
            System.out.println("1.  1,5 % Verzinsung ohne Bonuszahlung");
            System.out.println("2.  0,7 % Verzinsung mit 15 Euro Bonuszahlung");
            System.out.println("3.  0,4 % Verzinsung mit 20 Euro Bonuszahlung");
            System.out.println("4.  0,1 % Verzinsung mit 50 Euro Bonuszahlung");
            System.out.println("5.  Fertig");
            System.out.println("........................................");

            System.out.print("Bitte wählen Sie eine der Optionen aus: ");
            auswahl = scanner.nextInt();

            switch (auswahl) {
                case 1:
                    System.out.println("Das Kapital beträgt: " + berechneKapital(1.5f, 0, anlagebetrag, laufzeit));
                    break;
                case 2:
                    System.out.println("Das Kapital beträgt: " + berechneKapital(0.7f, 15, anlagebetrag, laufzeit));
                    break;
                case 3:
                    System.out.println("Das Kapital beträgt: " + berechneKapital(0.4f, 20, anlagebetrag, laufzeit));
                    break;
                case 4:
                    System.out.println("Das Kapital beträgt: " + berechneKapital(0.1f, 50, anlagebetrag, laufzeit));
                    break;
                case 5:
                    System.out.println("Das Programm wird beendet.");
                    break;
                default:
                    System.out.println("Bitte wählen Sie eine der Möglichkeiten 1-5");
                    break;
            }
        } while (auswahl != 5);
    }

    public static void getAnlagebetragUndLaufzeit() {
        System.out.print("Bitte geben Sie die Laufzeit der Anlage ein: ");
        laufzeit = scanner.nextInt();
        System.out.print("Bitte geben Sie den Anlagebetrag ein: ");
        anlagebetrag = scanner.nextDouble();
    }

    public static double berechneKapital(float verzinsung, int bonus, double anlagebetrag, int laufzeit) {
        double kapital = anlagebetrag * (laufzeit + verzinsung / 100) + bonus;
        return kapital;
    }
}
