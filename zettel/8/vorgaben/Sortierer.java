public class Sortierer extends AbstrakterSortierer{

    @Override
    public void sortieren(Sequenz s) {
        for (int i = 0; i < s.size()-1; i++) {
            // erste i Elt.
            for (int j = 0; j < s.size()-i-1; j++) {
                if(s.get(j)>s.get(j+1)) s.tausche(j, j + 1);

            }
        }
    }
}
