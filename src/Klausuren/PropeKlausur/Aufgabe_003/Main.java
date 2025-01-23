package Klausuren.PropeKlausur.Aufgabe_003;

public class Main {

    public static void main(String[] args) {
        System.out.println(spiegeln("abc"));
        System.out.println(erhöheUm2("5"));
    }

    public static String spiegeln(String s) {
        String result = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            result += s.charAt(i);
        }
        return result;
    }

    public static String erhöheUm2(String number) {
        int num = Integer.parseInt(number);
        num += 2;
        return String.valueOf(num);
    }
}
