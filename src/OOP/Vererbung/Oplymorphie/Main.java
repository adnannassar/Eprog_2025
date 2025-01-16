package OOP.Vererbung.Oplymorphie;

public class Main {
    public static void main(String[] args) {
        X x = new X();
        Y y = new Y();
        Z z = new Z();

        sendReparatur(x);
        sendReparatur(y);
        sendReparatur(z);
    }

    public static void sendReparatur(X x){
        System.out.println("Reparatur durch x");
    }
}
