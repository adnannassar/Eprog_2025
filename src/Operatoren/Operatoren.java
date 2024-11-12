package Operatoren;

public class Operatoren {
    public static void main(String[] args) {
        // arithmetische Operatoren (+, -, *, /, %)

        // ++ -- (inkrementieren, dekrementieren)
        int x = 10;

        // post-increment
        System.out.println("Pre increment: " + x++);  // --> 10

        // pre-increment
        System.out.println("Post increment: " + ++x); // x= 12

        // += -= *= /= %= (addieren, subtrahieren, multiplizieren, dividieren, modulo)
        x += 5; // x = x + 5
        x -= 5; // x = x - 5
        x *= 5; // x = x * 5
        x /= 5; // x = x / 5
        x %= 5; // x = x % 5

        // Vergleichsoperatoren (==, !=, >, <, >=, <=)
        x = 10;
        boolean xIstGroßerZehn = (x != 10);
        System.out.println("x ist größer als 10: " + xIstGroßerZehn);

        // logische Operatoren (&&, ||, !)
        x = 15;
        boolean xIstZwischenZehnUndZwanzig = (x > 10 && x < 20);
        System.out.println("x ist zwischen 10 und 20: " + xIstZwischenZehnUndZwanzig);
        // x ist größer als 10 oder x ist kleiner als 20
        boolean xIstGroßerZehnOderKleinerNeun = (x > 10 || x < 9);
        System.out.println("x ist größer als 10 oder kleiner als 9: " + xIstGroßerZehnOderKleinerNeun);
        // user hat das Passwort eingegeben
        // if(password == 12345 && userName == "Admin") {
        //    if(userRole == "Prof" || userRole == "Admin") { // Noten eintragen }
        // }

        // boolean userIstEingeloggt = false;

        // if( !userIstEingeloggt ) { Noten nicht einsehen dürfen!}

    }
}
