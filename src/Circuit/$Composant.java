package Circuit;

public abstract class $Composant  implements _Composant{
	
	private int nb_entree;
	private int nb_sortie;
	private int indice;
	private PortEntree[] entrees;
	private PortSortie[] sorties;
	
	public void initExec(){
		
	}
	
	public abstract boolean evalExec();
	
	public boolean exec(){
		initExec();
		return evalExec();
	}
	
}
