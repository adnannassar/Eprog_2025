package OOP.Vererbung.PersonExample;

public class Main {
    public static void main(String[] args) {
        Person p = new Person("Max", 20);
        Student s = new Student("Ali", 22, "123456");
        Mitarbeiter m = new Mitarbeiter("Ahmad", 23, "Büro: 123456");
        Professor professor = new Professor("Hans", 50, "Informatik");
    }
}
