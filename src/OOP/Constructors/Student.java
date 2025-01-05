package OOP.Constructors;

public class Student {
    // Attributes
    String name;
    int age;
    char gender;
    float note;


    // Constructors

    // Default Constructor
    public Student() {
    }

    // 2 Parameters Constructor
    public Student(String na, int ag) {
        name = na;
        age = ag;
    }

    // 4 Parameters Constructor
    public Student(String name, int age, char gender, float note) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.note = note;
    }


    // Methods
}
