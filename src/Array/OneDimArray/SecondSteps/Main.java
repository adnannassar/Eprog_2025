package Array.OneDimArray.SecondSteps;

public class Main {
    public static void main(String[] args) {
        int[] array = new int[10]; // {0, 0, 0, 0, 0, 0, 0, 0, 0, 0}

        for (int i = 0; i < array.length; i++) {
            array[i] = i * i - 1;
        }

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
