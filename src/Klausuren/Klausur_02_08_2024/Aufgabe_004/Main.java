package Klausuren.Klausur_02_08_2024.Aufgabe_004;

public class Main {


    public static void main(String[] args) {
        int daten[] =  {3, 0, 2, 2, 3, 0, 0, 2, 2, 2, 3};
        System.out.println(histogramm(daten)); // 4
    }

    // a) maximum
    private static int maximum(int[] array) {
        // annehmen, dass das erste Element das Maximum ist
        int max = array[0];
        // durch das Array gehen und das Maximum finden
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    // b) histogramm

   private static int [] histogramm(int[] daten){
        int [] histogramm = new int[daten.length];
        for(int i = 1; i < daten.length; i++){
            int number = daten[i];
            int counter = 1;
            for(int j = 0; j < daten.length; j++){
                if(daten[j] == number){
                    counter++;
                }
            }
            histogramm[i] = counter;
        }
        return histogramm;
    }
    // c) median
    private static float median(int[] array) {
        if (array.length % 2 != 0) {
            // ungerade
            return array[array.length / 2];
        } else {
            // gerade
            int middle = array.length / 2;
            float sum = array[middle] + array[middle - 1];
            return sum / 2;
        }
    }
}
