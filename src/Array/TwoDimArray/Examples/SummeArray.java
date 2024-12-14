package Array.TwoDimArray.Examples;

public class SummeArray {
    public static void main(String[] args) {
        int[][] array = {
                {2, 1},
                {5, 6, 8},
                {100, 200},
                {30, -10, 40, 15},
                {2, 3}
        };
        System.out.println("Summe: " + sumArray(array));
    }

    private static int sumArray(int[][] array) {
        int summe = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++){
                summe += array[i][j];
            }

        }
        return summe;
    }
}
