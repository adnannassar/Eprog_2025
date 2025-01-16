package OOP.Vererbung.Abstract.Form;

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle("blue", 10, 20);
        Circle circle = new Circle("green", 5);
        Square square = new Square("yellow", 15);
        Triangle triangle = new Triangle("orange", 10, 20, 30);

        System.out.println("Rectangle: " + rectangle.fläche());
        System.out.println("Circle: " + circle.fläche());
        System.out.println("Square: " + square.fläche());
        System.out.println("Triangle: " + triangle.fläche());
    }
}
