package Array.TwoDimArray.DrawingInArray;

public class Aufgabe_Y {

    public static void main(String[] args) {
        char[][] array = new char[5][5];
        drawY(array);
        printArray(array);
    }


    private static void drawY(char[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (i % 2 == 0 && j % 2 == 0) {
                    array[i][j] = 'Y';
                } else if (i % 2 != 0 && j % 2 != 0) {
                    array[i][j] = 'Y';
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
