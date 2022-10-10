class Groesse {
    public double wert;
    public String einheit;

    /* Aufgabenteil (a) */
    // 1
    public Groesse(double dd, String s){
        wert = dd;
        einheit = s;

    }
}

class Land {
    public String name;
    public int einwohner;
    public Groesse flaeche;

    /* Aufgabenteil (b) */
    // 1.5
    public Land(String[] in){
        name = in[0];
        einwohner = LaenderDaten.getIntValue(in[1]);
        flaeche = new Groesse(LaenderDaten.getIntValue(in[2]), "km^2");
    }

    /* Aufgabenteil (c) */
    // 1
    public void printLand(){
        System.out.println(name);
        System.out.println("\t" + einwohner + " EW");
        System.out.println("\t" + flaeche.wert + flaeche.einheit);


    }

}

public class Welt {
    public static Land[] laender;

    /* Aufgabenteil (d) */
    // 1.5
    public static void initLaender(){
        laender = new Land[LaenderDaten.daten.length];
        int count = 0; 
        for(String[] s : LaenderDaten.daten){
            laender[count] = new Land(s); 
            count++;
        }


    }

    /* Aufgabenteil (e) */
    // 1
    public static int summeEinwohner(){
        int count = 0;
        for(Land x : laender){
            count += x.einwohner;
        }
        return count;
    }

    /* Aufgabenteil (f) */
    // 2
    public static Land kleinstesLand(){
        Land temp = laender[1];
        for(Land x : laender){
            if(x.flaeche.wert<temp.flaeche.wert){
                temp = x;
            }
        }
        return temp;
    }


    public static void main(String[] args){
        /* zum Testen die Zeilenkommentare entfernen */
        initLaender();
        System.out.println("Weltbevölkerung (2020): " + summeEinwohner());
        System.out.println("Kleinstes Land der Welt: ");
        Land minLand = kleinstesLand();
        minLand.printLand();

            
        
    }
}
