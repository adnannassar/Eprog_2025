package Array.OneDimArray.FirstSteps;

public class Main {
    public static void main(String[] args) {
        // daten bekannt!
        int[] array = {10, 20, 30, 40, 50}; // {10, 20, 30, 40, 50}
        System.out.println("Array 1: ");
        System.out.println("Length von Array1: " + array.length); // 5
        System.out.println("Value of index 0 in Array 1 = " + array[0]); // 10
        System.out.println("Value of index 4 in Array 1 = " + array[4]); // 50


        // daten unbekannt!
        int[] array2 = new int[5];  // {0, 0, 0, 0, 0}
        array2[0] = 15; // {15, 0, 0, 0, 0}
        array2[3] = -5; // {15, 0, 0, -5, 0}
        System.out.println("\nArray 2: ");
        System.out.println("Length von Array2: " + array2.length);
        System.out.println("Value of index 0 in Array 2 = " + array2[0]);
        System.out.println("Value of index 3 in Array 3 = " + array2[3]);
        System.out.println("Value of index 4 in Array 2 = " + array2[4]);
    }
}
