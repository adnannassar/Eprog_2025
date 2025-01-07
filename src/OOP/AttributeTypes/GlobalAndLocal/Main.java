package OOP.AttributeTypes.GlobalAndLocal;

public class Main {
    int x = 10;

    public static void main(String[] args) {

    }

    void test() {
        int x = 20;
        int y = 30;
        System.out.println(x); // 20
        System.out.println(this.x); // 10
        {
            // int y = 40; Fehler
        }
    }

    int add(int a, int b) {
        //  int a = 10; // Fehler
        return a + b;
    }
}
