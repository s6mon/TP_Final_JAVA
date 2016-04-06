package Circuit;

public class PortEntree extends $Port {
	private Fil entree;
	
	public PortEntree() {
		etat = Etat.FALSE;
	}
	
	public void setFilPort(Fil fil){
		entree = fil;
	}
	
	public void majEtat(){
		etat = entree.getEntree().getEtat();
	}
}
