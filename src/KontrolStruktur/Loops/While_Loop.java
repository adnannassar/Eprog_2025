package KontrolStruktur.Loops;

public class While_Loop {
    public static void main(String[] args) {
        System.out.println("For:");
        for (int x = 1; x <= 10; x++) {
            System.out.print(x + " ");
        }

        System.out.println("\nWhile: ");
        int x = 1;
        while (x <= 10) {
            System.out.print(x + " ");
            x++;
        }
    }
}
