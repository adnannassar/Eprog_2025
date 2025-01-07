package OOP.AttributeTypes;

public class Mitarbeiter {
    private String name;
    private int alter;
    private double gehalt;
    private int id;
    private static int counter = 0;

    public Mitarbeiter(String name, int alter, double gehalt) {
        this.name = name;
        this.alter = alter;
        this.gehalt = gehalt;
        counter++;
        this.id = counter;
    }

    public void printTest() {
        System.out.println("Test");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAlter() {
        return alter;
    }

    public void setAlter(int alter) {
        this.alter = alter;
    }

    public double getGehalt() {
        return gehalt;
    }

    public void setGehalt(double gehalt) {
        this.gehalt = gehalt;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public void printInfo() {
        System.out.println("Id: " + id + ", Name: " + name + ", Alter: " + alter + ", Gehalt: " + gehalt);
    }
}
