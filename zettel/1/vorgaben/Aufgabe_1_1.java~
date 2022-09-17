//Alexandros Apostolidis
public class Aufgabe_1_1 {
    public static void main(String[] args){
	// Systen.out.println("Übung " + 1 + ':');
	System.out.println("Übung "+1+':'); // Systen changed to System // FEHLER ZEILE 1
	// Es existiert nur eine Library namens System, nicht jedoch Systen.
	// Systen geändert zu System

        // int a1=1,a2=a1;a3=a1+a2;
	int a1=1,a2=a1,a3=a1+a2;
	// Ein Semikolon bedeutet das Ende eines Ausdrucks. Somit wäre der zweite Ausdruck in dieser Zeile: a3=a1+a1; a3 ist jedoch noch nicht deklariert worden
	// Semikolon nach der 2. Wertzuweisung in ein Komma geändert. // FEHLER ZEILE 2
	
         boolean b = (3 < 2);

	 

	// short s1 = 33333;
	int s1 = 33333;
	// Maximaler Wert von short ist 32767<33333. => overflow // FEHLER ZEILE 3
	// Datentyp von short zu int geändert.
	
	 char c1 = 'ü';



	 // char c2 = '1', c3 = c2 + 1;
	 char c2 = '1', c3 = (char) (c2 + 1);
	 // Ergebnis von c2 (char) +1 ist int. Da ein int-Wert nicht umbedingt einem char-Wert entsprechen muss, muss in char zurückgecastet werden.
	 // Ergebnis in char gecasted. //FEHLER ZEILE 4

	 // float f = 1.0;
	 float f = 1.0f;
	 //1.0 ist ein codierter double Wert, der sich grundlegend von dem float-Wert 1.0 unterscheidet, aufgrund der Präzision der Annäherung durch den Datentyp.
	 // in float codierte "1.0" auf die Variable f geschrieben. // FEHLER ZEILE 5
	 
	 // double d = 1E2E;
	 double d = 0x1E2E;
	 // Es wurde versucht, eine Hexadezimalzahl einer Variable zuzuschreiben, dabei jedoch vergessen, die Zahl als Hexadezimal zu kennzeichen.
	 // 1E2E in 0x1E2E geändert.  // FEHLER ZEILE 6
	 

	// int i = 'uOOOO'; 
	int i = '\u0000'; // Anführungszeichen?
	// int i soll zu unicode 0000 gesetzt werden, ein Unicode Zeichen wird aber durch [Backlash]u und nicht durch ein u initiiert. Außerdem müssen nach dem u Nuller und nicht Os folgen.	
	// 'uOOOO' in '\u0000' geändert. // FEHLER ZEILE 7


	
        long l = 0xABC;

	
 	// char c = '\';
	char c = '\\';
	// Backslash ist ein "Escape"-Zeichen. Das bedeutet, dass das "'", das das Ende des Zeichens bedeuten sollte, ebenfalls in der Zeichenkette ist.
	// Das Backslash-Zeichen "escaped", also ein weiteres Backslashzeichen eigefügt. //FEHLER ZEILE 8

        // short s2 = 10, s3 = 3, s4 = (short) s2 % (short) s3;
	short s2 = 10, s3 = 3, s4 = (short) s2%s3;
	// Ergebnis des Modulo Operators ist int, es könnte zu overflow kommen. Außerdem wurden s2 und s2 (schon short Werte) in short gecastet.
	// Ergebnis in short gecastet, anstatt s2 und s3. // FEHLER ZEILE 9
	
	// int bb = (0x1 < 0x2) ? (0xA / 0x5) : 0x;
	int bb = (0x1 < 0x2) ? (0xA / 0x5) : 0x0;
	// Es sollte falls 0x1<0x2 falsch ist, bb auf 0x gesetzt werden, was unmöglcih ist, da ein bestimmter Wert gesetzt werden muss, 0x aber nur besagt, dass der zu setzende Wert in Dezimal eigegeben wird, nicht jedoch welcher Wert gesetzt werden soll.
	// 0x geändert zu naheliegenstem Wert 0x0. // Fehler Zeile 10.
	
	
    }
}


