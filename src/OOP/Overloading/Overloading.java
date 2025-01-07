package OOP.Overloading;

public class Overloading {
    public static void main(String[] args) {
        print(1);
        print(1, 2);
        print(1, 2L);
        print(1L, 2);
        print('a');
        print("Hello");
    }

    public static void print(int a) {
        System.out.println("Int a");
    }

    public static void print(int a, int b) {
        System.out.println("Int a, Int b");
    }



    public static void print(int a, long b) {
        System.out.println("Int a, Long b");
    }

    public static void print(long a, int b) {
        System.out.println("Long a, Int b");
    }

    public static void print(char a) {
        System.out.println("Char a");
    }

    public static void print(String a) {
        System.out.println("String a");
    }
}
