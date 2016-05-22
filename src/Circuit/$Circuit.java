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
			//System.out.println(execList.get(i) + "," + execList.get(i).compConnected());
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
	
	public $Composant getComposant(int n_comp){return elements.get(n_comp);}
	
	public void tri(){
		ArrayList<Integer> listNbEntree = new ArrayList<Integer>();
		$Composant c;
		int j =0, k = 0;
		for(int i=0; i<execList.size(); i++){
			c = execList.get(i);
			listNbEntree.add(c.nb_entree);	
		}

		while( execList.size() !=  j){
			k=j;
			while(listNbEntree.size() != k && listNbEntree.get(k) != 0){
				k++;
			}
			echanger(listNbEntree, j, k);
			j++;
		}
	}
	
	void echanger(ArrayList<Integer> list, int j, int k){
		$Composant c = execList.get(k);
		execList.set(k, execList.get(j));
		execList.set(j, c);
		
		int val = list.get(k);
		list.set(k, list.get(j));
		list.set(j, val);
	}
	
	void majNbEntree($Composant c){
		/*int nbSortie  = c.nb_sortie;
		
		for(int i=0; i<nbSortie; i++){
			getSortie(i);
			
		}*/
		
	}
	
}


