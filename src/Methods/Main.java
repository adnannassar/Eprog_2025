package Methods;

public class Main {
    public static void main(String[] args) {
        String user = "Ibrahim";

        int summe = warenkorbSumme();

        if (user.equals("Ibrahim")) {
            // 5% Rabatt
            summe = summe - (summe * 5 / 100);
            System.out.println("Warenkorb summe für Ibrahim = " + summe);
        } else {
            System.out.println("Warenkorb summe = " + summe);
        }
    }

    static int warenkorbSumme() {
        int item1 = 70;
        int item2 = 20;
        int item3 = 10;
        int summe = item1 + item2 + item3;
        return summe;
    }

}
