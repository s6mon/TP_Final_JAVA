package Circuit;

import jus.util.assertion.*;

public class Non extends $Transformateur{

	/**
	 * Constructeur par défaut du transformateur Non
	 * @ensure : this.nb_entree == 1 && this.nb_sortie == 1
	 */
	public Non() throws Ensure {
		this.nb_entree = 1;
		this.nb_sortie = 1;
		this.entrees = new PortSimple[1];
		entrees[0] = new PortSimple();
		this.sorties = new PortMultiple[1];
		sorties[0] = new PortMultiple();
		if(!(this.nb_entree == 1 && this.nb_sortie == 1)) {
			throw new Ensure ("!(this.nb_entree == 1 && this.nb_sortie == 1)");
		}
	}

	/**
	 * Fonction qui permet la mise à jour de l'état dans le port de sortie
	 */
	public void eval() {
		if (this.entrees[0].getEtat() == Etat.TRUE) {
			this.sorties[0].setEtat(Etat.FALSE); 
		} else if (this.entrees[0].getEtat() == Etat.FALSE) {
			this.sorties[0].setEtat(Etat.TRUE); 
		}
	}
}
