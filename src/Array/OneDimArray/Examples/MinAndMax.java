package Array.OneDimArray.Examples;

public class MinAndMax {
    public static void main(String[] args) {
        int[] array = {2, 5, 1, 3, 4};
        System.out.println("Max value: " + findMax(array));
        System.out.println("Min value: " + findMin(array));
    }

    private static int findMax(int[] array) {
        // annehmen, dass das erste Element das Maximum ist
        int max = array[0];
        // durch das Array gehen und das Maximum finden
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    private static int findMin(int[] array) {
        // annehmen, dass das erste Element das Minimum ist
        int min = array[0];
        // durch das Array gehen und das Minimum finden
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }
}
