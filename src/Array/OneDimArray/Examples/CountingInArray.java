package Array.OneDimArray.Examples;

public class CountingInArray {
    public static void main(String[] args) {
        int[] array = {2, 5, 9, 1, 3, 4, 3, 9, 15, 9};
        System.out.println("Counting in array:");

        System.out.println("Count of 3: " + count(array, 3)); // 1
        System.out.println("Count of 5: " + count(array, 5)); // 1
        System.out.println("Count of 9: " + count(array, 9)); // 3
        System.out.println("Count of 7: " + count(array, 7)); // 0

        System.out.println("................................................");

        System.out.println("Count of gerade zahlen: " + countGeradeZahlen(array)); // 2
        System.out.println("Count of ungerade zahlen: " + countUngeradeZahlen(array)); // 4

        System.out.println("................................................");

        System.out.println("Count of zahlen durch 3 teilbar: " + countZahlenDurchNTeilbar(array, 3)); // 5
    }

    private static int count(int[] array, int i) {
        int count = 0;
        for (int j = 0; j < array.length; j++) {
            if (array[j] == i) {
                count++;
            }
        }
        return count;
    }

    private static int countGeradeZahlen(int[] array) {
        int count = 0;
        for (int j = 0; j < array.length; j++) {
            if (array[j] % 2 == 0) {
                count++;
            }
        }
        return count;
    }

    private static int countUngeradeZahlen(int[] array) {
        int count = 0;
        for (int j = 0; j < array.length; j++) {
            if (array[j] % 2 != 0) {
                count++;
            }
        }
        return count;
    }

    private static int countZahlenDurchNTeilbar(int[] array, int n) {
        int count = 0;
        for (int j = 0; j < array.length; j++) {
            if (array[j] % n == 0) {
                count++;
            }
        }
        return count;
    }
}
