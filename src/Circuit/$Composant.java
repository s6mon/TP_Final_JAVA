package Circuit;

public abstract class $Composant  implements _Composant{
	
	protected int nb_entree;
	protected int nb_sortie;
	protected PortSimple[] entrees;
	protected PortMultiple[] sorties;
	
	public abstract void eval();

	public boolean compConnected() {
		for(int i =0; i<nb_entree; i++){
			if(!entrees[i].portEntreeConnected()){
				return false;
			}
		}
		for(int i=0; i<nb_sortie; i++){
			if(!sorties[i].portSortieConected()){
				return false;
			}
		}
		return true;
	}
	
	public PortMultiple getSorties(int i){
		return sorties[i];
	}
	
	public PortSimple getEntree(int i){
		return entrees[i]; 
	}
	
	public void exec(){
		majEtatPortsEntrees();
		eval();
	}

	private void majEtatPortsEntrees() {
		for (int i = 0; i<nb_entree; i++){
			entrees[i].majEtat();
		}
		
	}
}
