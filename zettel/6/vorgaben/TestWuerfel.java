public class TestWuerfel {

    public static void main(String[] args){
        int n = 6, k = 3;
        Wuerfel[] wuerfel = new Wuerfel[n];
        
        /* *** Aufgabenteil (c) *** */
        // 2
        wuerfel[0] = new ZahlenWuerfel(6);
        wuerfel[1] = new ZahlenWuerfel(6);
        wuerfel[2] = new ZahlenWuerfel(12);
        wuerfel[3] = new ZahlenWuerfel(12);
        wuerfel[4] = new Farbwürfel();
        wuerfel[5] = new Farbwürfel();
        for(int i=0; i<k; i++){
            System.out.println(i+". Wurf");
            for(Wuerfel w : wuerfel){
                w.werfen();
            }
            for(int j=0; j< wuerfel.length; j++) {
                System.out.println(wuerfel[j].toString());
            }
            System.out.println();
        }
        
    }
}
