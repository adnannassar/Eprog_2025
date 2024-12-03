package Swaping;

public class Main {
    public static void main(String[] args) {
        int x = 10;
        int y = 20;
        System.out.println("Before swapping: x = " + x + ", y = " + y);

        int temp = x;
        x = y;
        y = temp;
        System.out.println("After swapping: x = " + x + ", y = " + y);
    }
}
