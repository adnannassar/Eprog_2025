package OOP.JavaBeans;

public class Student {
    // Attributes
    public String name;
    private int age;
    char gender;
    protected float note;

    // Constructor
    public Student(String name, int age, char gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    // Getters
    public String getName() {
        return name;
    }

    public char getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

    public float getNote() {
        return note;
    }


    // Setters
    public void setAge(int age) {
        this.age = age;
    }

    public void setNote(float note) {
        this.note = note;
    }


    // Methods
    public void printStudentInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Gender: " + gender);
        System.out.println("Note: " + note);
    }
}
