package Circuit;

public class PortSimple extends $Port {
	private Fil entree;
	
	public PortSimple() {
		etat = Etat.FALSE;
		connected = false;
	}
	
	public void connect(Fil fil){
		entree = fil;
		connected = true;
	}
	
	public void majEtat(){
		etat = entree.getEntree().getEtat();
	}

	public boolean portEntreeConnected() {
		return connected;
	}
}
