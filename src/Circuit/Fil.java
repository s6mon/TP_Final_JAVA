package Circuit;

public class Fil {
	private PortSortie entree; //on parle bien de port de composant d'ou l'inversion entree/sortie
	private PortEntree sortie;
	
	
	public Fil(PortSortie entr, PortEntree sort){
		entree = entr;
		sortie = sort;
		sortie.connect(this);
		entree.connect(this);
	}
	
	public PortSortie getEntree(){
		return entree;
	}
}
