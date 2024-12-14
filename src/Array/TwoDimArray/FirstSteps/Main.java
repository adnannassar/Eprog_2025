package Array.TwoDimArray.FirstSteps;

public class Main {
    public static void main(String[] args) {
        // daten bekannt!
        int[][] array = {
                {10, 20, 30},
                {40, 50},
                {70, 80, 90},
                {100, 110, 120}
        };
        System.out.println("Array 1: ");
        System.out.println("Length von Array1: " + array.length); // 4
        System.out.println("Length von Array1 at index1: " + array[1].length); // 2
        System.out.println("Value of index 1,1 in Array 1 = " + array[1][1]); // 50
        System.out.println("Value of index 2,2 in Array 1 = " + array[2][2]); // 90
        System.out.println("Value of index 3,1 in Array 1 = " + array[3][1]); // 110


        // daten unbekannt!
        int[][] array2 = new int[3][2];
        //{
        // {0, 0},
        // {0, 0},
        // {0, 0}
        //}
        array2[0][0] = 15;
        //{
        // {15, 0},
        // {0, 0},
        // {0, 0}
        //}
        array2[1][1] = -5;
        //{
        // {15, 0},
        // {0, -5},
        // {0, 0}
        //}


        System.out.println("\nArray 2: ");
        System.out.println("Length von Array2: " + array2.length); // 3
        System.out.println("Value of index 0,0 in Array 2 = " + array2[0][0]); // 15
        System.out.println("Value of index 1,1 in Array 3 = " + array2[1][1]); // -5
        System.out.println("Value of index 2,0 in Array 2 = " + array2[2][0]); // 0

    }
}
