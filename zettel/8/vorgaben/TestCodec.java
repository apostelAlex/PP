public class TestCodec {
    public static void main(String[] args) {
        String text1 = "Programmieren lernt man nur durch Programmieren!";
        String text2 = "De eeitnJ odVrdine di f nafr i iesrWahAfs hrsneEenc esubsesrecelr  hWi ne itemhuedEv etJdnEna dee enozleaetneruen L trutnhretrkn ,Ziee,vr.rtue etG icnr oa  .ervneanvhtpdruWz rpi rleitfri miwD reBwauljeieg,reidireexeiars e  ieeshsgisshnensustsseuase art ienca  ,nt nLte iehehusR dzi ei dn enrsiadeuszbovr endeenuarntuenoiGi lindmstg, nennanhibd s    e n gl acezdcmM5uru.dtaMthnwihia mfn e xe.";

        int N = 10;
        Codec[] codecs = new Codec[N];
        
        for (int i=3;i<=11;i++) {
            codecs[i-3] = new SkytaleCipher(i);
        }
        codecs[N-1] = new AtbaschCipher();

        System.out.println(text1 + " -> ");
        for (int i=0;i<N;i++) {
            String coded = codecs[i].encode(text1);
            System.out.println((i+1) + ". --> " + coded);
        }

        /* *** Aufgabenteil (c) *** */
        // 1

        for (int i = 5; i < 26; i++) { // alles einfach mal ausgeben
            SkytaleCipher temp = new SkytaleCipher(i); // neue Chiffre mit Schlüssel i
            System.out.println(i + ": " + temp.decode(text2)); // für i = 17 kam ein sinnvoller Text heraus.

        }


        /*
        * Die abstrakte Klasse Cipher muss Codec implementen ("... implements Codec"), s.d. jede Unterklasse von Cipher
        * dieses Interface implementiert. Sonst würden die Funktionen encode bzw. decode möglicherweise nicht
        * implementiert werden.
        * */
    }
}
