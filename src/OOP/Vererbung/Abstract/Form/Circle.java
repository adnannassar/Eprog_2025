package OOP.Vererbung.Abstract.Form;

public class Circle extends Form {
    private double radius;

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double fläche(){
        return 2 * Math.PI * radius;
    }
}
