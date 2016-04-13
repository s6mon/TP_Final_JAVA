package Circuit;

import java.util.ArrayList;

public abstract class $Circuit implements _Circuit{
	
	protected ArrayList<$Composant> elements;
	protected boolean executable;
	
	/**
	 * Fonction de l'invariant
	 * @return true si le circuit est bel et bien fermé, false sinon
	 */
	public void setExecutable(){
		boolean res = true;
		for (int i = 0; i<elements.size(); i++){
			if (!elements.get(i).compConnected()){
				res = false ;
			}
		}
		executable = res;
	}
	
	public int nbComposant(){return elements.size();}
	
	public void ajouterComp($Composant c){
		elements.add(elements.size(), c);
	}
	
	public $Composant getComposant(int n_comp){return elements.get(n_comp);}
	
}


