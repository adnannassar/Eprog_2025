package KontrolStruktur.Conditions;

import java.util.Scanner;

public class IF_ELse {
    public static void main(String[] args) {
        int richtigesPasswort = 12345;
        String richtigesBenutzer = "Admin";

        Scanner scanner = new Scanner(System.in);
        System.out.print("Bitte geben Sie Ihr Benutzername ein: ");
        String eingegebenBenutzerNamen = scanner.next();

        System.out.print("Bitte geben Sie Ihr Passwort ein: ");
        int eingegebenPasswort = scanner.nextInt();

        if (eingegebenPasswort != richtigesPasswort) {
            System.out.println("Passwort ist falsch!");
        } else if (!(eingegebenBenutzerNamen.equals(richtigesBenutzer))) {
            System.out.println("Benutzer ist falsch!");
        } else {
            System.out.println("Sie sind Eingeloggt!");
        }
        System.out.println("........................................");
        int x = 0;
        if (x > 0) {
            System.out.println("x is Positiv");
        } else if (x == 0) {
            System.out.println("x is Zero");
        } else {
            System.out.println("x is Negativ");
        }
    }
}
