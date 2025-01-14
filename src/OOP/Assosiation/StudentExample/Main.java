package OOP.Assosiation.StudentExample;

public class Main {
    public static void main(String[] args) {
        Address address = new Address("Straße", 10, "12345", "Ort");

        Student student = new Student("John", 20, address);

        Kontakt email_1 = new Kontakt("Email", "test@gmail.com");
        Kontakt email_2 = new Kontakt("Email", "test2@hotmail.com");
        Kontakt phoneNumber = new Kontakt("Phone", "023 1123 12312");
        Kontakt MobileNumber = new Kontakt("Mobile Phone", "0049 123 456 789");

        student.addKontakt(email_1);
        student.addKontakt(email_2);
        student.addKontakt(phoneNumber);
        student.addKontakt(MobileNumber);

        student.printInfo();
    }
}
