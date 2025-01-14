package OOP.Assosiation.StudentExample;

public class Student {
    private String name;
    private int age;
    private int id;
    private static int counter = 0;

    // 1 to 1 relationship ( Association ) Muss beziehung,
    // weil Address und Student sind abhängig voneinander,
    // sodass wir kein Objekt von Student ohne Address erstellen können.
    private Address address;

    // 1 to n relationship ( Association ) Kann beziehung,
    // weil Kontakt und Student sind nicht abhängig voneinander,
    // sodass wir ein Objekt von Student ohne Kontakt erstellen können.
    private Kontakt[] kontakts;

    public Student(String name, int age, Address address) {
        this.name = name;
        this.age = age;
        this.id = ++counter;
        this.address = address;
        this.kontakts = new Kontakt[5]; // {null, null, null, null, null}
    }

    public void addKontakt(Kontakt kontakt) {
        for (int i = 0; i < kontakts.length; i++) {
            if (kontakts[i] == null) {
                kontakts[i] = kontakt;
                break;
            }
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public static int getCounter() {
        return counter;
    }

    public static void setCounter(int counter) {
        Student.counter = counter;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Kontakt[] getKontakts() {
        return kontakts;
    }

    public void setKontakts(Kontakt[] kontakts) {
        this.kontakts = kontakts;
    }

    public void printInfo() {
        System.out.println("Id: " + id + ", Name: " + name + ", Age: " + age);
        System.out.println("Address: " + address.getStraße() + " " + address.getHausnummer() + ", " + address.getPlz() + " " + address.getOrt());
        System.out.println("Kontakts: ");
        for (Kontakt kontakt : kontakts) {
            if (kontakt != null) {
                System.out.println(kontakt.getType() + ": " + kontakt.getValue());
            }
        }
    }
}
