package Circuit;

import java.util.ArrayList;

public interface _Circuit {
	
	/**
	 * getteur de nb_comp
	 * @return nb_comp
	 */
	public int nbComposant();
	
	/**
	 * Procédure pour ajouter un fil au circuit
	 * @param f le fil a rajouter dans le circuit
	 */
	public void ajouterComp($Composant c, int indice);
	
	public void ajouterComp($Composant c, int indice, ArrayList<Fil> sorties);
	
	/**
	 * getteur pour elements
	 * @param n_comp le numéro du composant que l'on veut
	 * @return elements[n_comp]
	 */
	public $Composant getComposant(int n_comp);
	
	/**
	 * execute le circuit, si c'est un circuit ouvert alors exécute le circuit avec la valeur des ports d'entrés
	 */
	public void exec();

	
	public void tri();
}
