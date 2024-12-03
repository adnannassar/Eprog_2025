package Array.OneDimArray.Examples;

public class Median {
    public static void main(String[] args) {
        int[] array1 = {1, 5, 4, 3, 8};
        System.out.println("Median of array 1: " + median(array1)); // 4
        int[] array2 = {1, 5, 4, 3, 2, 8};
        System.out.println("Median of array 2: " + median(array2)); // 3.5


    }

    private static float median(int[] array) {
        if (array.length % 2 != 0) {
            // ungerade
            return array[array.length / 2];
        } else {
            // gerade
            int middle = array.length / 2;
            float sum = array[middle] + array[middle - 1];
            return sum / 2;
        }
    }


}
