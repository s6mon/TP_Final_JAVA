package Circuit;

public class Vcc extends $Generateur{
	
	public Vcc (){
		nb_entree = 0;
		nb_sortie = 1;
		etat = Etat.HAUT;
		entrees = null;
		sorties = new PortMultiple[1];
		sorties[0] = new PortMultiple();
	}
	
	@Override
	public void majEtat() {}

	@Override
	public void eval() {
		sorties[0].setEtat(Etat.TRUE);
	}

	
}
