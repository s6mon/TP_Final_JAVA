package Circuit;

public class Fil {
	private PortMultiple entree; //on parle bien de port de composant d'ou l'inversion entree/sortie
	private PortSimple sortie;
	
	
	public Fil(PortMultiple entr, PortSimple sort){
		entree = entr;
		sortie = sort;
		sortie.connect(this);
		entree.connect(this);
	}
	
	public PortMultiple getEntree(){
		return entree;
	}
	
	public PortSimple getSortie(){
		return sortie;
	}
	
	public void brancherEntree(PortMultiple p){
		entree = p;
		entree.connect(this);
	}
	
	public void brancherSortie(PortSimple p){
		sortie = p;
		sortie.connect(this);
	}
}
