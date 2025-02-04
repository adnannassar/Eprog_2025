package Klausuren.Klausur_14_02_2024.Aufgabe_004;

public class Aufgabe_004 {
    public static void main(String[] args) {
        System.out.println(sindGleich("Apple", "Apple"));
        System.out.println(sindGleich("Apple", "Orange"));

        System.out.println(getWortVonIndizes("abcdef", "aabdex"));
        System.out.println(getWortVonIndizes("Hallo", new int[]{1,3,4}));
    }

    static boolean sindGleich(String u, String v) {
        if (u.length() != v.length()) {
            return false;
        }
        for (int i = 0; i < u.length(); i++) {
            if (u.charAt(i) != v.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    public static String getWortVonIndizes(String u, String v) {
        String erg = "";
        for (int i = 0; i < u.length(); i++) {
            if (u.charAt(i) == v.charAt(i)) {
                erg += u.charAt(i);
            }
        }
        return erg;
    }

    // "Hallo"  , { 1,3,4} --> alo
    public static String getWortVonIndizes(String w, int[] feld) {
        String erg = "";
        for (int i = 0; i < w.length(); i++) {
            for(int j = 0 ; j< feld.length; j++){
                if(i == feld[j]){
                    erg += w.charAt(i);
                }
            }
        }
        return erg;
    }


}
