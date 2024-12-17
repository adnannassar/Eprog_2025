package Array.TwoDimArray.DrawingInArray;

public class Aufgabe_A_Gerade_Ungerade {

    public static void main(String[] args) {
        char[][] array = new char[5][5];
        drawA_Gerade_Ungerade(array);
        printArray(array);
    }


    private static void drawA_Gerade_Ungerade(char[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (i % 2 == 0 && j % 2 != 0) {
                    array[i][j] = 'A';
                } else if (i % 2 != 0 && j % 2 == 0) {
                    array[i][j] = 'A';
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
