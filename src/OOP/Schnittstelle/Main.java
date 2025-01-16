package OOP.Schnittstelle;

public class Main {
    public static void main(String[] args) {
        A a = new A();
        a.printA();

        B b = new B();
        b.printA();
        b.printB();

        C c = new C();
        c.printA();
        c.printB();
        c.printC();
        c.printInterface();
    }
}
