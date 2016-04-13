package Circuit;

import java.util.ArrayList;

public abstract class $Composant  implements _Composant{
	
	protected int nb_entree;
	protected int nb_sortie;
	protected int indice;
	protected ArrayList<PortEntree> entrees;
	protected ArrayList<PortSortie> sorties;
	
	public void eval(){
		
	}

	public boolean compConnected() {
		for(int i =0; i<nb_entree; i++){
			if(!entrees.get(i).portEntreeConnected()){
				return false;
			}
		}
		for(int i=0; i<nb_sortie; i++){
			if(!sorties.get(i).portSortieConected()){
				return false;
			}
		}
		return true;
	}	
}
