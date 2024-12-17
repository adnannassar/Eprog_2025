package Array.TwoDimArray.DrawingInArray;

public class Aufgabe_O_U {

    public static void main(String[] args) {
        char[][] array = new char[5][5];
        drawO_U(array);
        printArray(array);
    }


    private static void drawO_U(char[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (i < array.length / 2) {
                    array[i][j] = 'O';
                } else if (i == array.length / 2) {
                    array[i][j] = '=';
                } else if (i > array.length / 2) {
                    array[i][j] = 'U';
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
