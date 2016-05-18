package Circuit;

public class Gcc extends $Generateur {
	
	public Gcc(){
		nb_entree = 0;
		nb_sortie = 1;
		etat = Etat.BAS;
		entrees = null;
		sorties = new PortMultiple[1];
		sorties[0] = new PortMultiple();
	}

	@Override
	public void majEtat() {}

	@Override
	public void exec() {
		sorties[0].setEtat(Etat.FALSE);
	}

}
