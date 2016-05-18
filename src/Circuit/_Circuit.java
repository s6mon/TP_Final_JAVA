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
	
	/**
	 * Procédure pour brancher la sortie i2 du composant c2 a l'entrée i1 du composant c1
	 * @param c1 le composant sur lequel on connecte l'entrée i1
	 * @param i1 le numéro du port d'entree de c1 à connecter
	 * @param c2 le composant depuis lequel on connecte la sortie
	 * @param i2 le numéro du port de sortie de c2 à connecter
	 */
	public void brancher ($Composant c1, int i1, $Composant c2, int i2);
	
}
