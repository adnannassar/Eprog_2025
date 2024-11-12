package KontrolStruktur.Loops;

public class Do_While_Loop {
    public static void main(String[] args) {
        System.out.println("For:");
        for (int x = 20; x <= 10; x++) {
            System.out.print(x + " ");
        }

        System.out.println("\nWhile: ");
        int x = 20;
        while (x <= 10) { // kopf gesteuerte Schleife
            System.out.print(x + " ");
            x++;
        }

        System.out.println("\nDo While: ");
        int y = 20;
        do {
            System.out.print(y + " ");
            y++;
        } while (y <= 10); // fuß gesteuerte Schleife
    }
}
