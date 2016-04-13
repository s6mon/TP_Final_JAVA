package Circuit;

public class PortEntree extends $Port {
	private Fil entree;
	
	public PortEntree() {
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
