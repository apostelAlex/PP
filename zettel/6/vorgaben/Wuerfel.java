import java.util.Random;

public class Wuerfel {
    private int nr;

    public Wuerfel(int nr){
	this.nr = nr;
    }

    public void werfen() {}  // Methode macht nichts;

    public String toString() {
        return "Wuerfel Nr. " + nr;	
    }
}

/* *** Aufgabenteil (a) *** */
// 4
class ZahlenWuerfel extends Wuerfel{
    int n_seiten;
    int wert;
    private static int count=1;

    public ZahlenWuerfel(int n_seiten){
        super(count);
        this.n_seiten = n_seiten;
        count++;
    }
    public void werfen(){
        Random rand = new Random();
        wert = rand.nextInt(n_seiten)+1 ;
    }
    public String toString(){
        return "Zahlen-"+super.toString() + " ("+n_seiten+" Seiten) -> "+ wert;
    }

}



/* *** Aufgabenteil (b) *** */
// 4
class Farbwürfel extends Wuerfel{
    static String[] farben = {"blau", "rot", "gruen", "gelb"};
    String farbe;
    static int count = 1;
    public Farbwürfel(){
        super(count);
        count++; 
    }
    public void werfen(){
        Random rand = new Random();
        farbe = farben[rand.nextInt(farben.length)];
    }
    public String toString(){
        return "Farb-" + super.toString() + " -> " + farbe;
    }
    
}

