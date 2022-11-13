import static java.lang.Character.*;

public class AtbaschCipher extends Cipher implements Codec{

    private static char spiegeln(char c){
        if(!isLetter(c)){
            return c;
        }
        int diff = Character.toLowerCase(c) - 'a';
        if(isUpperCase(c)){
            return (char) ('Z'-diff);
        }
        return (char) ('z'-diff);
    }

    private static String codieren(String text){
        char[] textchar = text.toCharArray();
        StringBuffer temp = new StringBuffer();
        for (char c : textchar) {
            temp.append(spiegeln(c));
        }
        return temp.toString();

    }
    @Override
    public String encode(String text) {
        return codieren(text);
    }

    @Override
    public String decode(String text) {
        return codieren(text);
    }
}
