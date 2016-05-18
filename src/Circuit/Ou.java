package Circuit;

import jus.util.assertion.*;

public class Ou extends $Transformateur{
	
	/**
	 * Constructeur par défaut du transformateur Ou
	 * @ensure this.nb_entree == 2 && this.nb_sortie == 1
	 */
	public Ou() throws Ensure {
		this.nb_entree = 2;
		this.nb_sortie = 1;
		this.entrees = new PortSimple[2];
		for(int i = 0; i < 2; i++) {
			entrees[i] = new PortSimple();
		}
		this.sorties = new PortMultiple[1];
		sorties[0] = new PortMultiple();
		if(!(this.nb_entree == 2 && this.nb_sortie == 1)) {
			throw new Ensure ("!(this.nb_entree == 2 && this.nb_sortie == 1)");
		}
	}

	/**
	 * Fonction qui permet la mise à jour de l'état dans le port de sortie
	 */
	public void exec() {
		if (this.entrees[0].getEtat() == Etat.TRUE || this.entrees[1].getEtat() == Etat.TRUE) {
			this.sorties[0].setEtat(Etat.TRUE);
		} else if (this.entrees[0].getEtat() == Etat.FALSE && this.entrees[1].getEtat() == Etat.FALSE) {
			this.sorties[0].setEtat(Etat.FALSE);
		}
	}
	
}
