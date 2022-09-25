// Alexandros Apostolidis
public class Aufgabe_2_3{
    // Aufgabenteil (a)
    // 3 4 6 9 13 18 24 ...
    // Schema: f(n) = f(n-1) + n-1 
    public static void folge_a() {
        long n1 = 3;
        long res;
        for(int i = 1; i<=15; i++){
            res = n1;
            for(int j=1; j<i; j++){
                res += j;
            }
            System.out.print(res+ " ");
        }
        System.out.println();
    }

    // Aufgabenteil (b)
    // 4 5 3 6 7 5 8 9 ...
    // Schema: Die n-te Zahl der Folge ist, wenn n mod 3 = 2 ist, der (n-1)-te Wert +1;
     //                                     wenn n mod 3 = 0 ist, der (n-1)-te Wert -2;
    //                                      wenn n mod 3 = 1 ist, der (n-1)-te Wert +3;
    // Anmerkung: In dem Aufgabenblatt steht die Ausgabe bei b) bis zum 16. Element, obwohl die Aufgabe eigentlich nur 15 verlangt hat.
    // Falls tatsächlich nur 15 Werte berechnet werden sollten, muss in der for-Schleife statt i<15 im Test i<14 getestet werden.

    public static void folge_b() {
        long res = 4;
        System.out.print(res + " ");
        for(int i = 0; i<15; i++){
            switch (i%3) {
                case 0:
                    res+=1;
                    break;
                case 1:
                    res -=2;
                    break;
                case 2:
                    res += 3;
                    break;
            }
            System.out.print(res + " ");
            }

            System.out.println();
        }
    
    
    // Aufgabenteil (c)
    // 3 4 6 3 7 12 6
    // Schema: Wenn n mod 3 nicht 1 ist, wird n zum Wert von n-1 + (n-1). 
            // Falls n mod 3 = 1 gilt, wird n zum Wert von n-1 - (n-1).
    public static void folge_c() {
        long res = 3;
        for(int i = 0; i<15; i++){
            if((i%3)>0){
                res += i;
            }
            else{
                res -= i;
            }
            System.out.print(res + " ");

        }
        System.out.println();
    }

    
    public static void main(String[] args){
        System.out.println("Aufgabenteil (a)");
        folge_a();  // erste Folge berechnen und ausgeben
        System.out.println("\nAufgabenteil (b)");
        folge_b();  // zweite Folge berechnen und ausgeben
        System.out.println("\nAufgabenteil (c)");
        folge_c();  // dritte Folge berechnen und ausgeben
        System.out.println();
    }


}
