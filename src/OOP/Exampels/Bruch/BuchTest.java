package OOP.Exampels.Bruch;

import org.w3c.dom.ls.LSOutput;

public class BuchTest {

    public static void main(String[] args) {
        Bruch b1 = new Bruch(2, 3);

        Bruch b2 = b1.kehrwert();

        b1.printBruch();
        b2.printBruch();
    }


}
