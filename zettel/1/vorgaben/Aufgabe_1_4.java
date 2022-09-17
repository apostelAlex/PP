//Alexandros Apostoldis
public class Aufgabe_1_4 {
    public static void main(String[] args){
        int zahl = readInt4();  // vierstellige ganze Zahl einlesen
	int store = zahl;
	int einer = zahl%10;
	zahl /= 10;
	int zehner = zahl%10;
	zahl /= 10;
	int hunderter = zahl%10;
	zahl/= 10;
	int tausender = zahl;
	boolean bedingung = einer>=zehner && zehner>=hunderter && hunderter >= tausender;
	System.out.println(bedingung ? "Die Ziffern der Zahl " + store + " sind monoton steigend." : "Die Ziffern der Zahl " +	store +	" sind nicht monoton steigend.");
    }

    
    /* Methode liest eine vierstellige Zahl ein */
    public static int readInt4() {
        int x = 0;
        do {
            x = IOTools.readInteger("4-stellige ganze Zahl: ");
        } while ((x < 1000) || (x > 9999));
        
        return x;
    }
}
