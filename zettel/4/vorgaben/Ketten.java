public class Ketten {
    public static String[] perlen = {"xxx","ooo","[0]"};
    private static String ende = "#";
    private static String conn = "-";


    /* *** Aufgabenteil (a)  *** */
    // 4
    public static String abschluss(String in){

        return ende+conn+in+conn+ende;
    }

    public static String verbinden(String s1, String s2){

        return s1+conn+s2;
    }
    public static String verbinden(String s1, String s2, String s3){

        return s1+conn+s2+conn+s3;
    }

    public static String verbinden(String s, int i){

        return ((s+conn).repeat(i-1))+s; // i ist a priori positiv, also > 0 
    }


}
