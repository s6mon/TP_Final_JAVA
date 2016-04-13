package Circuit;

import jus.util.assertion.Ensure;
import jus.util.assertion.Require;

public class Et extends $Transformateur{
	
	/**
	 * Constructeur par défaut du transformateur Et
	 * @ensure this.nb_entree == 2 && this.nb_sortie == 1
	 */
	public Et() throws Ensure {
		this.nb_entree = 2;
		this.nb_sortie = 1;
		this.entrees = new PortEntree[2];
		for(int i = 0; i < 2; i++) {
			entrees[i] = new PortEntree();
		}
		this.sorties = new PortSortie[1];
		sorties[0] = new PortSortie();
		if(!(this.nb_entree == 2 && this.nb_sortie == 1)) {
			throw new Ensure ("!(this.nb_entree == 2 && this.nb_sortie == 1)");
		}
	}
	
	/**
	 * Fonction qui permet la mise à jour de l'état dans le port de sortie
	 */
	public void eval() {
		if (this.entrees[0].getEtat() == Etat.FALSE || this.entrees[1].getEtat() == Etat.FALSE) {
			this.sorties[0].setEtat(Etat.FALSE);
		} else if (this.entrees[0].getEtat() == Etat.TRUE && this.entrees[1].getEtat() == Etat.TRUE) {
			this.sorties[0].setEtat(Etat.TRUE);
		}
	}
	
}
