package Circuit;

public interface _Composant {
	
	/**
	 * met a jour la valeur du port de sortie de composant en fonction des valeur de ses port d'entrés.
	 */
	public void exec();
	
	/**
	 * Renvois true si tout les port du composoant sont bien connecté.
	 */
	public boolean compConnected();
	
	/**
	 * Renvoie la sortie numéro i
	 * @param i le numéro de la sortie voulu (0...n)
	 */
	public PortMultiple getSorties(int i);
	
	/**
	 * Renvoie l'entrée numéro i
	 * @param i le numéro de l'entrée voulu (0...n)
	 */
	public PortSimple getEntree(int i);
	
	/**
	 * Met à jour l'état des port d'entrée du composant.
	 */
	public void majEtatPortsEntrees();
	
	

}
