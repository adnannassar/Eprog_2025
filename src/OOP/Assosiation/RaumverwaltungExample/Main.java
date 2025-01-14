package OOP.Assosiation.RaumverwaltungExample;

public class Main {
    public static void main(String[] args) {
        Raumverwaltung rv = new Raumverwaltung();

        Raum r1 = new Raum('C', '2', "30");

        Raum r2 = new Raum('C', '2', "40");
        Professor p1 = new Professor("Konstantin Koll");
        r2.setNutzer(p1);

        Raum r3 = new Raum('C', '2', "41");
        Professor p2 = new Professor("Michael Stark");
        r3.setNutzer(p2);

        Raum r4 = new Raum('A', '2', "02");
        Raum r5 = new Raum('A', '2', "03");


        rv.addRaum(r1);
        rv.addRaum(r2);
        rv.addRaum(r3);
        rv.addRaum(r4);
        rv.addRaum(r5);

        rv.ausgabeRaumliste();
    }
}
