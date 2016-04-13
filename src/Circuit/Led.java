package Circuit;


public class Led extends $Recepteur {

	public Led(int i){
		nb_entree = 1;
		nb_sortie = 0;
		etat = Etat.FALSE;
		entrees = new PortEntree[1];
		entrees[0] = new PortEntree();
		sorties = null;
	}
	
	public Led (int i, Etat e){
		this(i);
		etat = e;
	}
	@Override
	public void majEtat() {
		etat = entrees[0].getEtat();
	}
	
	public void eval(){
		majEtat();
	}

}
