package Methods.Dosenrechner;

import java.util.Scanner;

public class DosenRechner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Bitte geben Sie das Radius der Dose ein: ");
        double radius = scanner.nextDouble();

        System.out.print("Bitte geben Sie die Höhe der Dose ein: ");
        double höhe = scanner.nextDouble();

        System.out.println("........................................");
        System.out.println("Umfang: " + berechneUmfang(radius));
        System.out.println("Deckelfläche: " + berechneDeckelfläche(radius));
        System.out.println("Mantelfläche: " + berechneMantelfläche(radius, höhe));
        System.out.println("Oberfläche: " + berechneOberfläche(radius, höhe));
        System.out.println("Volumen: " + berechneVolumen(radius, höhe));
        System.out.println("........................................");
    }



    static double berechneUmfang(double radius) {
        return 2 * Math.PI * radius;
    }
    static double berechneDeckelfläche(double radius) {
        return Math.PI * radius * radius;
    }
    static double berechneMantelfläche(double radius, double höhe) {
        double umfang = berechneUmfang(radius);
        return umfang * höhe;
    }
    static double berechneOberfläche(double radius, double höhe) {
        return 2 * berechneDeckelfläche(radius) + berechneMantelfläche(radius , höhe);
    }
    static double berechneVolumen(double radius, double höhe) {
        return berechneDeckelfläche(radius) * höhe;
    }

}
