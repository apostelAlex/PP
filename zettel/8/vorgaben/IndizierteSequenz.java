public class IndizierteSequenz implements Sequenz{
    private int[] werte;
	
    public IndizierteSequenz(int n){
		this.werte = new int[n];
		for (int i=0;i <n;i++){
			this.werte[i] = (int)(Math.random()*100) + 1;
		}
    }

	@Override
	public int size() {
		return werte.length;
	}

	@Override
	public int get(int i) {
		if (i>size()-1) return -1;
		return werte[i];
	}

	@Override
	public int vergleiche(int i, int j) {
		if(werte[i]>werte[j]){
			return 1;
		} else if (werte[i]<werte[j]) {
			return -1;
		} else {
			return 0;
		}
	}

	@Override
	public void tausche(int i, int j) {
		int temp = werte[i];
		werte[i] = werte[j];
		werte[j] = temp;
	}

	/* *** Aufgabenteil (b) *** */


}
