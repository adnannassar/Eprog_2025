package Array.TwoDimArray.DrawingInArray;

public class Aufgabe_L_X_R {

    public static void main(String[] args) {
        char[][] array = new char[5][5];
        drawL_X_R(array);
        printArray(array);
    }


    private static void drawL_X_R(char[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (j < array.length / 2) {
                    array[i][j] = 'L';
                } else if (j == array.length / 2) {
                    array[i][j] = 'X';
                } else if (j > array.length / 2) {
                    array[i][j] = 'R';
                }
            }
        }
    }

    private static void printArray(char[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
