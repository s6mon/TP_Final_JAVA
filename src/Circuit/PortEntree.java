package Circuit;

public class PortEntree extends $Port {
	private Fil entree;
	
	public PortEntree() {
		etat = Etat.FALSE;
	}
	
	public PortEntree(Fil fila){
		entree = fila;
		fila.setPortSortie(this);
	}
	
}
