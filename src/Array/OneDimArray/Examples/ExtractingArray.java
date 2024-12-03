package Array.OneDimArray.Examples;

public class ExtractingArray {
    public static void main(String[] args) {
        int[] array = {2, 5, 9, 1, 3, 4, 3, 9, 15, 9, 17, 20, 23, 30};
        System.out.println("Array mit werte die durch 3 teilbar sind:");
        int[] result = extractArray(array, 3);
        printArray(result);


    }

    private static int[] extractArray(int[] array, int n) {
        int countDurchNTeilbar = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % n == 0) {
                countDurchNTeilbar++;
            }
        }

        int[] result = new int[countDurchNTeilbar];

        for (int i = 0, j = 0 ; i < array.length; i++) {
            if (array[i] % n == 0) {
                result[j] = array[i];
                j++;
            }
        }

        return result;
    }

    private static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}
