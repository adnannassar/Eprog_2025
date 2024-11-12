package KontrolStruktur.Conditions;

public class Switch_Case {
    public static void main(String[] args) {
        int x = 1;
        switch (x){
            case 0:
                System.out.println("x is Zero");
                break;
            case 1:
                System.out.println("x is One");
                break;
            case 2:
                System.out.println("x is Two");
                break;
            default:
                System.out.println("x is not Zero, One or Two");
        }
    }
}
