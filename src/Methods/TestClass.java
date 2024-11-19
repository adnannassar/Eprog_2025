package Methods;

import java.util.Scanner;

public class TestClass {

    public static void main(String[] args) {
        start();
    }

    static void start() {
        Scanner scanner = new Scanner(System.in);
        int option;
        do {
            System.out.println("1.Calculate");
            System.out.println("2.Ende");
            System.out.print("Bitte geben Sie Ihre Wahl ein: ");
            option = scanner.nextInt();
            if (option == 1) {
                calculate();
            } else if (option == 2) {
                System.out.println("Programm wird beendet!");
            }
        } while (option != 2);

    }

    static void calculate() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Calculator strated!");
        System.out.print("Bitte geben Sie die erste Zahl ein: ");
        int a = scanner.nextInt();
        System.out.print("Bitte geben Sie die zweite Zahl ein: ");
        int b = scanner.nextInt();
        System.out.print("Bitte geben Sie die Operation ein (+,-,*,/,%): ");
        String operation = scanner.next();

        switch (operation) {
            case "+":
                System.out.println("Result of a + b = " + add(a, b));
                System.out.println("........................................");
                break;
            case "-":
                System.out.println("Result of a - b = " + sub(a, b));
                System.out.println("........................................");
                break;
            case "*":
                System.out.println("Result of a * b = " + mul(a, b));
                System.out.println("........................................");
                break;
            case "/":
                System.out.println("Result of a / b = " + div(a, b));
                System.out.println("........................................");
            case "%":
                System.out.println("Result of a % b = " + mod(a, b));
                System.out.println("........................................");

            default:
                System.out.println("Bitte geben Sie eine gültige Operation ein!");
                System.out.println("........................................");
        }

    }

    static int add(int a, int b) {
        return a + b;
    }

    static int mul(int a, int b) {
        return a * b;
    }

    static int sub(int a, int b) {
        return a - b;
    }

    static int div(int a, int b) {
        return a / b;
    }

    static int mod(int a, int b) {
        return a % b;
    }
}
