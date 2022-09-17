//Alexandros Apostolidis
public class Aufgabe_1_3 {

    public static void main(String[] args){
	int a = IOTools.readInteger("Geben Sie die Kantenlänge ein: ");
	int h = IOTools.readInteger("Geben Sie nun die Höhe ein: ");
	double G, M, O, V;
	G = Math.pow(a,2)/4;
	G *= Math.sqrt(3);
	M = 3*a*h;
	O = 2*G+M;
	V = G*h;
	System.out.println("Grundflaeche: " + Math.round(G));
	System.out.println("Manteflaeche: " + Math.round(M));
	System.out.println("Oberflaeche: " + Math.round(O));
	System.out.println("Volumen: "  + Math.round(V));
	


    }
}
