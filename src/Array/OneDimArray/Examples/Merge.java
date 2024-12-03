package Array.OneDimArray.Examples;

public class Merge {
    public static void main(String[] args) {
        int[] a = {1, 3, 5, 7, 13};
        int[] b = {2, 4, 6, 10, 12, 14, 16, 20};

        System.out.println("a: ");
        printArray(a);

        System.out.println("b: ");
        printArray(b);

        int[] mergedArray = merge(a, b);
        System.out.println("Merged Array:");
        printArray(mergedArray);
    }

    private static int[] merge(int[] a, int[] b) {
        // create an empty array with the size of a and b
        int[] resulArray = new int[a.length + b.length];

        // write the elements of a into the result array
        for (int i = 0; i < a.length; i++) {
            resulArray[i] = a[i];
        }

        // write the elements of b into the result array
        for (int i = a.length, j = 0; i < resulArray.length; i++, j++) {
            resulArray[i] = b[j];
        }
        // sort the result array
        bubbleSort(resulArray);
        // return the result array
        return resulArray;
    }

    private static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
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
}
