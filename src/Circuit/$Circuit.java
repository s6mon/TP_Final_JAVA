package Circuit;

import java.util.ArrayList;
import java.util.HashMap;

public abstract class $Circuit implements _Circuit{
	
	protected HashMap<Integer, $Composant> elements;
	protected ArrayList<$Composant> execList;
	protected boolean executable;
	
	/**
	 * Fonction de l'invariant
	 * @return true si le circuit est bel et bien fermé, false sinon
	 */
	public void setExecutable(){
		boolean res = true;
		for (int i = 0; i<execList.size(); i++){
			if (!execList.get(i).compConnected()){
				res = false ;
			}
		}
		executable = res;
	}
	
	/**
	 * @return le nombre de composant
	 */
	public int nbComposant(){return elements.size();}
	
	/**
	 * Ajoute un composant sur le circuit sans le brancher (pour les générateur)
	 */
	public void ajouterComp($Composant c, int indice){
		execList.add(c);
		elements.put(indice, c);
	}
	
	/**
	 * Procédure pour brancher la sortie i2 du composant c2 a l'entrée i1 du composant c1
	 * @param c1 le composant sur lequel on connecte l'entrée i1
	 * @param i1 le numéro du port d'entree de c1 à connecter
	 * @param c2 le composant depuis lequel on connecte la sortie
	 * @param i2 le numéro du port de sortie de c2 à connecter
	 */
	public void brancher ($Composant c1, int i1, $Composant c2, int i2){
		Fil f = new Fil(c2.getSorties(i2), c1.getEntree(i1));
	}
	
	public void brancherEntree ($Composant c1, int i1, $Composant c2, int i2){
		
	}
	
	public $Composant getComposant(int n_comp){return elements.get(n_comp);}
	
}


