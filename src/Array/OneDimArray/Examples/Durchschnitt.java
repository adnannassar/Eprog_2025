package Array.OneDimArray.Examples;

public class Durchschnitt {
    public static void main(String[] args) {
        int[] array = {2, 5, 1, 3, 4}; // sum 15
        System.out.println("Durchschnitt Array: " + durchschnittArray(array)); // 15
    }

    private static int sumArray(int[] array) {
        int summe = 0;
        for (int i = 0; i < array.length; i++) {
            summe += array[i];
        }
        return summe;
    }

    private static int durchschnittArray(int[] array) {
        return sumArray(array) / array.length;
    }
}
