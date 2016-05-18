package Circuit;

import java.util.ArrayList;
import java.util.HashMap;

public abstract class $Circuit implements _Circuit{
	
	protected HashMap<Integer, $Composant> elements; //couple (nom, nomposant);
	protected ArrayList<$Composant> execList; //liste que l'on tri pour executer les elements dans le bon ordre.
	protected ArrayList<Fil> connexions;
	protected boolean executable;
	
	/**
	 * Fonction de l'invariant
	 * @return true si le circuit est bel et bien fermé, false sinon
	 */
	public void setExecutable(){
		boolean res = true;
		for (int i = 0; i<execList.size(); i++){
			System.out.println(execList.get(i) + "," + execList.get(i).compConnected());
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
	 * Ajoute un composant sur le circuit sans le brancher
	 */
	public void ajouterComp($Composant c, int indice){
		execList.add(c);
		elements.put(indice, c);
	}
	
	public void ajouterComp($Composant c, int indice, ArrayList<Fil> sorties){
		execList.add(c);
		elements.put(indice, c);
		for (int i = 0; i<sorties.size(); i++){
			connexions.add(sorties.get(i));
		}
		
		
	}
	
	public void connect(){
		for(int i=0; i<connexions.size(); i++){
			Fil f = connexions.get(i);
			f.brancher(elements.get(f.comp1()).getSorties(f.portComp1()), elements.get(f.comp2()).getEntree(f.portComp2()));
		}
	}
	
	/**
	 * Procédure pour brancher la sortie i2 du composant c2 a l'entrée i1 du composant c1
	 * @param c1 le composant sur lequel on connecte l'entrée i1
	 * @param i1 le numéro du port d'entree de c1 à connecter
	 * @param c2 le composant depuis lequel on connecte la sortie
	 * @param i2 le numéro du port de sortie de c2 à connecter
	 */
	public void brancher ($Composant c1, int i1, $Composant c2, int i2){}
	
	public $Composant getComposant(int n_comp){return elements.get(n_comp);}
	
}


