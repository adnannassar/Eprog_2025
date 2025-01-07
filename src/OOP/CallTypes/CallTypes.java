package OOP.CallTypes;

public class CallTypes {
    public static void main(String[] args) {
        System.out.println("Call by value");
        int x = 1;
        System.out.println("Before incrementX: " + x);
        incrementX(x);
        System.out.println("After incrementX: " + x);

        System.out.println("----------------------");

        System.out.println("Call by reference");
        int[] array = {1, 2, 3};
        System.out.println("Before incrementPostionOne: " + array[0]);
        incrementPostionOne(array);
        System.out.println("After incrementPostionOne: " + array[0]);


    }

    // call by value
    public static void incrementX(int x) {
        x++;
    }

    // call by reference
    public static void incrementPostionOne(int[] array) {
        array[0]++;
    }
}
