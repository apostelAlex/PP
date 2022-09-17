//Alexandros Apostolidis
public class Aufgabe_1_5 {
    public static void main(String[] args){
	int a = IOTools.readInteger("Geben Sie die erste Zahl ein: ");
	int b = IOTools.readInteger("Geben Sie die zweite Zahl ein: ");
	int c = IOTools.readInteger("Geben Sie die dritte Zahl ein: ");
	int max = (a>b) ? ((a>c) ? a : c) : ((b>c) ? b : c);
	int min = (a<b) ? ((a<c) ? a : c ): ((b<c) ? b : c);
	System.out.println("Maximale Differenz: "+ (max-min));
	
					   
    }
}

