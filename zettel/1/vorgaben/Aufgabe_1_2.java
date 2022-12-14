//Alexandros Apostolidis
public class Aufgabe_1_2 {
    public static void main(String[] args){	
	int a = 1, b = 2, c = 3, d = 4;
	
	
	/*  Aufgabenteil (a) 
	    Ergebnistyp: int
	    Ergebniswert: -3
	    
	    a+b -> 3
	    3/c -> 1
	    1-d -> -3
	 */

	// a + b / c - d;
	int e = a + b / c - d;
	System.out.println("e: " +e); 


	
	a = 1; b = 2; c = 3; d = 4; // reinitialisieren


	/* Aufgabenteil (b) 
	    Ergebnistyp: int
	    Ergebniswert: 5

	    a + (a+=1) -> 3, (a==2)
	    a + a , a+=1 -> 5, (a==3)
	    
	 */ 
	// a + ++a + a++;
        e = a + ++a + a++;
	System.out.println("e: " +e); 

	a = 1; b = 2; c = 3; d = 4; // reinitialisieren


	/* Aufgabenteil (c) 
	   Ausgabetyp: int
	   Ausgabewert: 6

	   a = a + 1 -> (a==2)
	   d = d/a -> (d==2)
	   c = c*d -> (c==6)
	   
	 */ 

	// c *= d /= ++a;
        e = c *= d /= ++a; 
	System.out.println("e: " +e); 

	a = 1; b = 2; c = 3; d = 4;  // reinitialisieren

	/*  Aufgabenteil (d) 
	    Ausgabetyp: boolean
	    Ausgabewert: falsch

	    1) b+a -> 3
	    2) c != 3 -> falsch
	    3) a+c -> 4
	    4) 4 > d -> falsch
	    5) 2) || 4) -> falsch
	 */ 
	
	// c != b + a || a + c > d;
        boolean e2 = c != b + a || a + c > d;
	System.out.println("e: "+e2); 

	a = 1; b = 2; c = 3; d = 4;      //  reinitialisieren

	/* Aufgabenteil (e) 
	   Ausgabetyp: int
	   Ausgabewert: 3

	   (a=a+1) + (b=b+1) -> 5, (a==2), (b==3)
	   d (d=d-1) + (d=d-1) -> 7, (d==2)
	   5 == 7 -> falsch
	   -> return c
	 */
	// (++a + ++b ==  d-- + --d) ? a : c;
	e = (++a + ++b ==  d-- + --d) ? a : c;
	System.out.println("e: " +e); 
   }
}

