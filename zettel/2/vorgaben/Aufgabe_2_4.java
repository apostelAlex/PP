// Alexandros Apostolidis
public class Aufgabe_2_4 {

    // 1.5
    // naechsten Tausch von Bechern festlegen
    public static String nextSwap(){
        // ganzzahlige Zufallszahl aus dem Intervall [1,6]
        int zufall = (int) (Math.random() * 6) + 1;
        String action = "";  // gibt an, welche Becher getauscht werden sollen

        switch (zufall) {
            case 1:
                action = "ab";
                System.out.println(("Tausche A mit B"));
                break;
            case 2:
                action = "ba";
                System.out.println("Tausche B mit A");
                break;
            case 3:
                action = "ac";
                System.out.println("Tausche A mit C");
                break;
            case 4:
                action = "ca";
                System.out.println("Tausche C mit A");
                break;
            case 5:
                action = "bc";
                System.out.println("Tausche B mit C");
                break;
            case 6:
                action = "cb";
                System.out.println("Tausche C mit B");
                break;
        }

        
        return action;
    }

    // 1
    // Position der Kugel bestimmen
    public static int getPosition(char a, char b, char c){
        int pos = 0;

        if(a == 'x'){
            pos = 1;
        }
        else if(b == 'x'){
            pos = 2;
        }
        else{
            pos = 3;
        }

        return pos;
    }

    
    // 1.5
    // Position der Kugel raten
    public static int guess(){
        int pos = 0;

        do{
            pos = IOTools.readInteger("Position: ");
        }while(pos >3 && pos <1);

        return pos;
    }


    // 3
    public static void main(String[] args){
        // Initialisierung der Becher (a und c leer, b belegt)
        char a = '-', b = 'x', c = '-';

        for (int i = 1;i <= 7; i++){
            String action = nextSwap();
            char temp;
            switch (action) {
                case "ab":
                case "ba":
                    temp = a;
                    a = b;
                    b = temp;
                    break;
                case "bc":
                case "cb":
                    temp = b;
                    b= c;
                    c = temp;
                case "ac":
                case "ca":
                    temp = a;
                    a=c;
                    c = temp;
            }
        }

        
        int guessPos = guess();
        int truePos = getPosition(a,b,c);       

        if(guessPos == truePos){
            System.out.println("Glückwunsch! Richtig geraten!");
        }
        else {
            System.out.println("Leider falsch! Die richtige Position ist " + truePos);
        }
        System.out.print(a + " " + b + " " + c + "\n");
    }
    
}
