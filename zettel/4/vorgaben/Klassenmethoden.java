public class Klassenmethoden {

    /* Aufgabenteil (a) */
    // 1
    public static boolean mehrheit(boolean b1, boolean b2, boolean b3){
        return b1^b2 ? b3 : b1;
    }


    /* Aufgabenteil (b) */
    // 2
    public static double anteil(int z, int... zz ){
        int count =0;
        int anzahl = 0;
        for(int x : zz){
            if(z == x){
                count++;
            }
            anzahl++;

        }
        
            if(anzahl>0){
            double res = (double) count/anzahl;
            return res*100;
        }   
        else
            return 0;
    }



    /* Aufgabenteil (c) */
    // 2
    public static int[] sammeln(int[][] in){
        int count = 0;
        for(int[] i : in)
            count += i.length;
        int[] eindimensional = new int[count];
        count = 0;
        for(int[] i : in){
            for(int x : i) {
                eindimensional[count] = x;
                count++;
            }

        }
        return eindimensional;
    }

    
    /*   Test */
    public static void main(String[] args){
        System.out.println("Aufgabenteil (a) ");
        boolean b1 = true, b2 = false, b3 = true;
        System.out.println(b1 + " " +  b2 + " " +  b3 + ": " + mehrheit(b1,b2,b3));
        b1 = false; b2 = true; b3 = true;
        System.out.println(b1 + " " +  b2 + " " +  b3 + ": " + mehrheit(b1,b2,b3));
        b1 = false; b2 = false; b3 = false;
        System.out.println(b1 + " " +  b2 + " " +  b3 + ": " + mehrheit(b1,b2,b3));
        b1 = true; b2 = false; b3 = false;
        System.out.println(b1 + " " +  b2 + " " +  b3 + ": " + mehrheit(b1,b2,b3));
        

                           

        
        System.out.println("\nAufgabenteil (b) ");
        int k = 1;
        System.out.println("Anteil der Zahl " +  k + ": ");
        System.out.println("(1) " + Math.round(anteil(1))  +  "%");
        System.out.println("(1) " + Math.round(anteil(1,1,2)) +  "%");
        System.out.println("(2) " + Math.round(anteil(1,1,2,2,1)) +  "%");
        System.out.println("(3) " + Math.round(anteil(1,1,2,2,1,1,3,2,3)) +  "%");
        
        System.out.println("\nAufgabenteil (c) ");
        int[][] ff1 = {{1}, {2,3}, {4,5,6}, {7}, {}, {}, {8,9,10}};
         int[] feld = sammeln(ff1);
         for (int x : feld) {
            System.out.print(x +  " ");
         }
        System.out.println();
    }
}
