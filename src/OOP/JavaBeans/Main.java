package OOP.JavaBeans;

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student("Ahmed", 20, 'M');

        //  s1.name = "Ahmad";
        System.out.println("Name: " + s1.getName());
        System.out.println("Gender: " + s1.getGender());

        // after one year
        s1.setAge(21);
        System.out.println("Age: " + s1.getAge());

        // after klausur note is 1.7
        s1.setNote(1.7f);
        System.out.println("Note: " + s1.getNote());

        // s1.printStudentInfo();
    }
}
