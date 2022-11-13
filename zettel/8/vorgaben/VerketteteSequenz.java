public class VerketteteSequenz implements Sequenz {

    private class Element {
	public int wert = -1;
	public Element next;
    }

    Element head,z;

    public VerketteteSequenz(){
	head = new Element();
	z = new Element();
	head.next = z;
	z.next = z;
    }

    public VerketteteSequenz(int n){
	this();
	for (int i=1;i<=n;i++){
	    Element e_neu = new Element();
	    e_neu.wert = (int) (Math.random() * 100) + 1;
	    e_neu.next = head.next;
	    head.next = e_neu;
	}
    }

    private Element getElementAt(int i){
		int count = 0;
		Element help = head.next;
		while ((help != z) && (count < i)){
			help = help.next;
			count++;
		}
		return (help != z) ? help : null;
    }

    public int size() {
		int count = 0;
		Element help = head.next;
		while (help != z){
	    	help = help.next;
	    	count++;
		}
		return count;
    }

	@Override
	public int get(int i) {
		Element temp = getElementAt(i);
		if(temp==null) return -1;

		else return temp.wert;
	}

	@Override
	public int vergleiche(int i, int j) {
		if (get(i)>get(j)){
			return 1;
		} else if (get(i)<get(j)) {
			return -1;
		}
		return 0;
	}

	@Override
	public void tausche(int i, int j) {
		int tempi = get(i);
		int tempj = get(j);
		if(tempi == -1 || tempj == -1){
			return;
		}
		getElementAt(i).wert = tempj;
		getElementAt(j).wert = tempi;


	}

	/* *** Aufgabenteil (c) *** */

}
