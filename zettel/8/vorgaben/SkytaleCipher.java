public class SkytaleCipher extends Cipher implements Codec{

    public SkytaleCipher(int k){
        key = k;
    }
    public String skytale(String input, boolean encode){
        int m,n;
        if(encode){
            m =key;
            if((input.length()%m)!=0){
                n = (input.length()/m)+1;
            } else n = input.length()/m;
        } else {
            n = key;
            if((input.length()%n)!=0){
                m = (input.length()/n)+1;
            } else m = input.length()/n;
        }
        char[][] matrix = new char[m][n];
        char[] chartext = input.toCharArray();
        int textlength = chartext.length;
        int count = 0;
        for (int i = 0; i < matrix.length; i++) { // make matrix
            for (int j = 0; j < matrix[i].length; j++) {
                if(count>= textlength) {
                    matrix[i][j] = ' ';
                    count++;
                    continue;
                }
                matrix[i][j] = chartext[count];
                count++;
            }
        }
        StringBuffer temp = new StringBuffer();
        for (int i = 0; i < matrix[0].length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                temp.append(matrix[j][i]);
            }
        }
        return temp.toString().trim();
    }

    @Override
    public String encode(String text) {
        return skytale(text, true);
    }

    @Override
    public String decode(String text) {
        return skytale(text, false);
    }
}
