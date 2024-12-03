package Array.OneDimArray.Examples;

public class SummeArray {
    public static void main(String[] args) {
        int[] array = {2, 5, 1, 3, 4}; // sum 15
        System.out.println("Summe: " + sumArray(array)); // 15
    }

    private static int sumArray(int[] array) {
        int summe = 0;
        for (int i = 0; i < array.length; i++) {
            summe += array[i];
        }
        return summe;
    }
}
