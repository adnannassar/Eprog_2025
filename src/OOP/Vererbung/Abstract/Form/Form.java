package OOP.Vererbung.Abstract.Form;

public abstract class Form {
    private String color;

    public Form(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public abstract double fläche();
}
