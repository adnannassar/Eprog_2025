package OOP.Assosiation.StudentExample;

public class Kontakt {
    private String type; // email, phone, fax, ...
    private String value; // test@gmail.com or 0123456789


    public Kontakt(String type, String value) {
        this.type = type;
        this.value = value;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
