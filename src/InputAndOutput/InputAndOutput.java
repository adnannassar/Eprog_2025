package InputAndOutput;

import java.util.Scanner;

public class InputAndOutput {
    // main method is the entry point of any java program
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scanner.next();
        System.out.println("Hello " + name + "!");
    }
}

