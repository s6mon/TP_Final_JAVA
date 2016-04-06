package Circuit;

public class Fil {
	private $Port portEntree;
	private $Port portSortie;
	
	
	public Fil($Port entree){
		portEntree = entree;
	}
	
	public void setPortSortie($Port p){
		portSortie = p;
	}
}
