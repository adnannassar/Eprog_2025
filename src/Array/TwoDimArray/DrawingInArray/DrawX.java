package Array.TwoDimArray.DrawingInArray;

public class DrawX {
    public static void main(String[] args) {
        char[][] array = new char[9][9];
        drawX(array);
        printArray(array);
    }


    private static void drawX(char[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (i == j) {
                    array[i][j] = '*';
                } else if (i + j == array.length - 1) {
                    array[i][j] = '*';
                } else if (j == array.length / 2) {
                    array[i][j] = '*';
                } else if (i == array.length / 2) {
                    array[i][j] = '*';
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
