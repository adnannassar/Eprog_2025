package OOP.Schnittstelle;

public class C extends B implements MyInterface {

    public void printC() {
        System.out.println("C from C");
    }

    @Override
    public void printInterface() {
        System.out.println("Interface from C");
    }

    @Override
    public int add() {
        return 1 + 1;
    }
}
