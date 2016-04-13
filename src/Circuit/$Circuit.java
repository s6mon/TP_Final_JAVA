package Circuit;

public abstract class $Circuit implements _Circuit{
	
	protected $Composant[] elements;
	protected boolean executable;
	
	/**
	 * Fonction de l'invariant
	 * @return true si le circuit est bel et bien fermé, false sinon
	 */
	public void setExecutable(){
		boolean res = true;
		for (int i = 0; i<elements.length; i++){
			if (!elements[i].compConnected()){
				res = false ;
			}
		}
		executable = res;
	}
	
	public int nbComposant(){return elements.length;}
	
	public void ajouterComp($Composant c){
		elements[elements.length] = c;
	}
	
	public $Composant getComposant(int n_comp){return elements[n_comp];}
	
}


