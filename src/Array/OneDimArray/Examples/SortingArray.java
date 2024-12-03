package Array.OneDimArray.Examples;

public class SortingArray {
    public static void main(String[] args) {
        int[] array = {2, 5, 1, 3, 4};
        System.out.println("Before sorting:");
        printArray(array);

        bubbleSort(array);

        System.out.println("After sorting:");
        printArray(array); // erwartet: 1 2 3 4 5
    }

    private static void bubbleSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j] > array[j + 1]) {
                    swap(array, j, j + 1);
                }
            }
        }
    }

    private static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }


    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}
