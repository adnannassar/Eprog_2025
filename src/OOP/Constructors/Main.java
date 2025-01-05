package OOP.Constructors;

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Ali";
        s1.age = 22;
        s1.gender = 'M';
        s1.note = 1.3f;

        Student s2 = new Student("Sara", 22);
        s2.gender = 'W';
        s2.note = 1.7f;

        Student s3 = new Student("Ahmed", 20, 'M', 1.0f);
        s3.name = "Ahmad";
    }
}
