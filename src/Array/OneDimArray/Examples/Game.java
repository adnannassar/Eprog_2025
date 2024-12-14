package Array.OneDimArray.Examples;

import java.util.Random;
import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        int[] array = new int[10];
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(1, 15);
        }

        int userSelection;
        int bootSelection;

        bootSelection = array[random.nextInt(0, array.length)];
        int anzalVersuche = 0;
        do {
            anzalVersuche++;
            System.out.print("Gib bitte eine Zahl ein: ");
            userSelection = scanner.nextInt();

            if (userSelection > bootSelection) {
                System.out.println("Die Zahl " + userSelection + " ist zu groß.");
            } else if (userSelection < bootSelection) {
                System.out.println("Die Zahl " + userSelection + " ist zu klein.");
            } else {
                System.out.println("Die Zahl " + userSelection + " ist richtig. Sie haben " + anzalVersuche + " Versuche benötigt.");
            }
        } while (userSelection != bootSelection);
    }

}

