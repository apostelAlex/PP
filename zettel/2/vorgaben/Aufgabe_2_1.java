// Name: Alexandros Apostolidis


public class Aufgabe_2_1 {
    public static void main(String[] args){
	/* *** Aufgabenteil (a)  *** */
	/* 
        Beginnend mit erg1 = 0 wird in der Schleife die Teilersumme von n gebildet. 
        Dabei werden jedoch nur die echten Teiler betrachtet.
        Anmerkung: Es existieren Formeln, die die Teilersumme annähern, 
        aber keine Formel für die exakte Bestimmung der Teilersumme einer Zahl.
        */
        
	int n = IOTools.readInteger("n = ");

	int erg1 = 0;

	for (int i=n/2;i>0;i--){
            erg1 += ((n%i) == 0) ? i : 0;
        }

	System.out.println("(a) Ergebnis:   = " + erg1 + "\n");


        /* *** Aufgabenteil (b)  *** */
	/* 
        f(n) = (n*n+n)/2
        Beginnend mit erg2 = 0 wird in der äußeren Schleife für jedes 1 ... n die innere Schleife aufgerufen. 
        Die innere Schleife inkrementiert erg2 um die Anzahl, des wievielten Mals die innere Schleife aufgerufen wurde.
        Es wird also die Summe über alle natürlichen Zahlen von 1 bis n gebildet.
        */
        
        n = IOTools.readInteger("n = ");
	int erg2 = 0;

	
	for (int i=1;i<=n;i++){
	    for (int j=1;j<=i;j++){
                ++erg2;
            }
	}

	System.out.println("(b) Ergebnis:   = " + erg2 + "\n");

        /* *** Aufgabenteil (c)  *** */
	/* 
        Beginnend mit erg3=0 wird in der Schleife die Spiegelzahl gebildet. 
        In der Schleife wird erg3 zuerst verzehnfacht. Danach wird zu erg3 die letzte Stelle von n addiert, 
        was durch n mod 10 erreicht wird. Daraufhin wird die letzte (Zehner-) Stelle von n abgeschnitten, 
        indem eine "int-Division" mit 10 gemacht wird (und zu n zugewiesen wird.)
        */
	
	n = IOTools.readInteger("n = ");
	int erg3 = 0;

        while (n > 0){
            erg3 *= 10;
            erg3 += n%10;
            n /= 10;
        }

	
	System.out.println("(c) Ergebnis:   = " +  erg3);

    }
}
