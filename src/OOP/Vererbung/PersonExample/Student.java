package OOP.Vererbung.PersonExample;

public class Student extends Person {
    // Student has a name and age from Person
    private String matriculationNumber;

    public Student(String name, int age, String matriculationNumber) {
        super(name, age);
        this.matriculationNumber = matriculationNumber;
    }

    public String getMatriculationNumber() {
        return matriculationNumber;
    }

    public void setMatriculationNumber(String matriculationNumber) {
        this.matriculationNumber = matriculationNumber;
    }
}
