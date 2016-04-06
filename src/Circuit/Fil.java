package Circuit;

public class Fil {
	private PortSortie entree; //on parle bien de port de composant d'ou l'inversion entree/sortie
	private PortEntree sortie;
	
	
	public Fil(PortSortie p1, PortEntree p2){
		entree = p1;
		sortie = p2;
	}
}
