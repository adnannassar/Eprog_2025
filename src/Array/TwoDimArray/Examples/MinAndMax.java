package Array.TwoDimArray.Examples;

public class MinAndMax {
    public static void main(String[] args) {
        int[][] array = {
                {2, 1},
                {5, 6, 8},
                {100, 200},
                {30, -10, 40, 15},
                {2, 3}
        };
        System.out.println(array.length);
        System.out.println("Max value: " + findMax(array));
        System.out.println("Min value: " + findMin(array));
    }

    private static int findMax(int[][] array) {
        // annehmen, dass das erste Element das Maximum ist
        int max = array[0][0];
        // durch das Array gehen und das Maximum finden
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] > max) {
                    max = array[i][j];
                }
            }

        }
        return max;
    }

    private static int findMin(int[][] array) {
        // annehmen, dass das erste Element das Minimum ist
        int min = array[0][0];
        // durch das Array gehen und das Minimum finden
        for (int i = 1; i < array.length; i++) {
            for (int j = 1; j < array[i].length; j++) {
                if (array[i][j] < min) {
                    min = array[i][j];
                }
            }
        }
        return min;
    }
}
