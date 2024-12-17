package Array.TwoDimArray.DrawingInArray;

import java.util.Scanner;

public class Aufgabe_A {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bitte geben Sie die Größe des Arrays ein: ");
        int n = scanner.nextInt();
        char[][] array;
        if (n < 5) {
            array = new char[5][9];
        } else {
            if (n % 2 != 0) {
                array = new char[n][2 * n - 1];
            } else {
                array = new char[n + 1][2 * n + 1];
            }
        }
        drawA(array);
        printArray(array);
    }


    private static void drawA(char[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (i + j == array.length - 1 || j - i == array.length - 1) {
                    array[i][j] = '*';
                } else if (i == array.length / 2 && j > array.length / 2 && j < array.length + 1) {
                    array[i][j] = '*';
                } else {
                    array[i][j] = ' ';
                }
            }
        }
    }

    private static void printArray(char[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
