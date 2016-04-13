package Circuit;

import jus.util.assertion.Ensure;
import jus.util.assertion.Require;

public class Non extends $Composant{

	/**
	 * Constructeur par défaut du transformateur Non
	 * @ensure : this.nb_entree == 1 && this.nb_sortie == 1
	 */
	public Non() throws Ensure {
		this.nb_entree = 1;
		this.nb_sortie = 1;
		this.entrees = new PortEntree[1];
		entrees[0] = new PortEntree();
		this.sorties = new PortSortie[1];
		sorties[0] = new PortSortie();
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
