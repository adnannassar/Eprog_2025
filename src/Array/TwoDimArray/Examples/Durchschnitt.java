package Array.TwoDimArray.Examples;

public class Durchschnitt {
    public static void main(String[] args) {
        int[][] array = {
                {2, 1},
                {5, 6, 8},
                {100, 200},
                {30, -10, 40, 15},
                {2, 3}
        };
        System.out.println("Durchschnitt Array: " + durchschnittArray(array)); // 30
    }


    private static int countArray(int[][] array) {
        int counter = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                counter++;
            }
        }
        return counter;
    }

    private static int sumArray(int[][] array) {
        int summe = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                summe += array[i][j];
            }
        }
        return summe;
    }

    private static int durchschnittArray(int[][] array) {
        return sumArray(array) / countArray(array);
    }
}
