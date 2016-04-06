package Circuit;

public abstract class $Composant  implements _Composant{
	
	protected int nb_entree;
	protected int nb_sortie;
	protected int indice;
	private PortEntree[] entrees;
	private PortSortie[] sorties;
	
	public Etat exec(){
		return Etat.FALSE;
	}
	
}
