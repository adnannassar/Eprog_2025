package OOP.Exampels.Dozent;

public class DozentTest {
    public static void main(String[] args) {
        Dozent dieDozentin = new Dozent("Prof. Dr. Maria Müller", "Informatik", 'W');
        dieDozentin.setLehrgebiet("Physik");


        Dozent derDekan = new Dozent("Prof. Dr. Hans Meier", "Mathematik", 'M');
        derDekan.setDekan(true);

        System.out.println("Dekan info:");
        System.out.println("Name: " + derDekan.getName());
        System.out.println("Lehrgebiet: " + derDekan.getLehrgebiet());
        System.out.println("Geschlecht: " + derDekan.getGeschlecht());
        System.out.println("ist Dekan? : " + derDekan.isDekan());


        System.out.println("...................");


        System.out.println("Dozentin info:");
        System.out.println("Name: " + dieDozentin.getName());
        System.out.println("Lehrgebiet: " + dieDozentin.getLehrgebiet());
        System.out.println("Geschlecht: " + dieDozentin.getGeschlecht());
        System.out.println("ist Dekan? : " + dieDozentin.isDekan());
    }
}
