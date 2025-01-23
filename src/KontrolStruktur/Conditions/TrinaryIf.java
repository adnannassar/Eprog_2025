package KontrolStruktur.Conditions;

public class TrinaryIf {
    public static void main(String[] args) {
        System.out.println("Max: "+ findMax(10, 20));
    }

    public static int findMax(int a, int b) {
       return  a > b ? a : b;
    }
}
