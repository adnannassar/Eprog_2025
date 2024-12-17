package Array.TwoDimArray.DrawingInArray;

public class Aufgabe_B_C {

    public static void main(String[] args) {
        char[][] array = new char[9][9];
        drawBC(array);
        printArray(array);
    }


    private static void drawBC(char[][] array) {

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (i + j == array.length / 2 ||
                        i + j == (array.length + array.length / 2) - 1) {
                    array[i][j] = 'B';
                } else if (i - j == array.length / 2 ||
                        j - i == array.length / 2) {
                    array[i][j] = 'C';
                } else {
                    array[i][j] = ' ';
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
