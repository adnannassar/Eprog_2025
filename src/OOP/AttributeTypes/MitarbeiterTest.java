package OOP.AttributeTypes;

public class MitarbeiterTest {
    public static void main(String[] args) {
        Mitarbeiter m1 = new Mitarbeiter("ALi", 22, 2500.0);
        Mitarbeiter m2 = new Mitarbeiter("Ahmad", 23, 720.25);
        Mitarbeiter m3 = new Mitarbeiter("Rana", 21, 11220.25);

        m1.printInfo();
        m2.printInfo();
        m3.printInfo();
    }
}
