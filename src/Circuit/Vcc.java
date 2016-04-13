package Circuit;

public class Vcc extends $Generateur{
	
	public Vcc (int i, Etat e){
		nb_entree = 0;
		nb_sortie = 1;
		indice = i;
		etat = Etat.TRUE;
		entrees = null;
		sorties[0] = new PortSortie();
	}
	
	@Override
	public void majEtat() {
		
	}

	@Override
	public void eval() {
		sorties[0].setEtat(etat);
	}

	
}
