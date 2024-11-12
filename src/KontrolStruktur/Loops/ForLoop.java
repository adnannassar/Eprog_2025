package KontrolStruktur.Loops;

public class ForLoop {
    public static void main(String[] args) {
        System.out.println("Aufsteigend");
        for (int x = 1; x <= 10; x++) {
            System.out.print(x + " ");
        }

        System.out.println("\nAbsteigend");
        for (int x = 10; x >= 1; x--) {
            System.out.print(x + " ");
        }
    }
}
