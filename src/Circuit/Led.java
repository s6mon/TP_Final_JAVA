package Circuit;


public class Led extends $Recepteur {

	public Led(){
		nb_entree = 1;
		nb_sortie = 0;
		etat = Etat.ALLUME;
		entrees = new PortSimple[1];
		entrees[0] = new PortSimple();
		sorties = null;
	}
	
	public Led (Etat e){
		etat = e;
	}
	@Override
	public void majEtat() {
		if (entrees[0].getEtat() == Etat.FALSE){
			etat = Etat.ETEINT;
		} else if(entrees[0].getEtat() == Etat.TRUE){
			etat = Etat.ALLUME;
		} else {
			etat = Etat.ERROR;
		}
	}
	
	public void eval(){
		majEtat();
		System.out.println(etat);
	}

}
