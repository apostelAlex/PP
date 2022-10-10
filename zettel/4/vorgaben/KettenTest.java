public class KettenTest {
   
    public static void main(String[] args){
		String[] ketten = new String[5];

			/* *** Aufgabenteil (b) *** */
			// 4

		String p1 = Ketten.perlen[0];
		String p2 = Ketten.perlen[1];
		String p3 = Ketten.perlen[2];

		ketten[0] = Ketten.abschluss(Ketten.verbinden(Ketten.verbinden(p1, 3), p3, Ketten.verbinden(p1, 3)));
		ketten[1] = Ketten.abschluss(Ketten.verbinden(p1,Ketten.verbinden(p2,Ketten.verbinden(p1,p2,p1) ,p2) ,p1));
		ketten[2] = Ketten.abschluss(Ketten.verbinden(p1, Ketten.verbinden(p1,Ketten.verbinden(p2,Ketten.verbinden(p2, p3, p2) , p2) , p1), p1));
		ketten[3] = Ketten.abschluss(Ketten.verbinden(p1, Ketten.verbinden(p2,Ketten.verbinden(p3,Ketten.verbinden(p1,p3,p1) , p3) , p2), p1));


		for (int i=0;i<ketten.length;i++){
			System.out.println((i+1) + ")  " + ketten[i]);
		}
    }
}
