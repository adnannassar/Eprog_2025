package Array.OneDimArray.Examples;

import java.util.Random;

public class Search_In_Array {
    public static void main(String[] args) {
        int[] array = new int[10];

        fillArrayRandomly(array);

        printArray(array);

        boolean result = searchInArray(array, 30);

        if (result) {
            System.out.println("Value found in array");
        } else {
            System.out.println("Value not found in array");
        }
    }

    public static boolean searchInArray(int[] array, int value) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) {
                return true;
            }
        }
        return false;
    }

    public static void fillArrayRandomly(int[] array) {
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10, 100);
        }
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}
