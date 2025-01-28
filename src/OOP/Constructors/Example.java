package OOP.Constructors;

public class Example {

    public static void main(String[] args) {
        B b = new B();
    }


    static class A{
        public A() {
            System.out.print("A");
        }
    }
    static  class B extends  A{
        public B(){
            System.out.print("Konstruiere");
        }
    }
}
