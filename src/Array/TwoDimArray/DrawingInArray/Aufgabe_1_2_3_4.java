package Array.TwoDimArray.DrawingInArray;

import java.util.Scanner;

public class Aufgabe_1_2_3_4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bitte geben Sie die Größe des Arrays ein: ");
        int n = scanner.nextInt();
        char[][] array;
        if (n % 2 != 0) {
            array = new char[n][n];
        } else {
            array = new char[n + 1][n + 1];
        }
        draw1_2_3_4(array);
        printArray(array);
    }


    private static void draw1_2_3_4(char[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (i == j || i + j == array.length - 1) {
                    array[i][j] = '*';
                } else if (i < array.length / 2 && (j > i && j < array.length - i - 1)) {
                    array[i][j] = '1';
                } else if (i > array.length / 2 && (j >= array.length - i && j < array.length - (array.length - i))) {
                    array[i][j] = '3';
                } else if (j < array.length / 2 && (i > j && i < array.length - j - 1)) {
                    array[i][j] = '4';
                } else if (j > array.length / 2 && (i >= array.length - j && i < array.length - (array.length - j))) {
                    array[i][j] = '2';
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
