package Circuit;


public class Led extends $Recepteur {

	public Led(int i){
		//nb_entree = 1;
		//nb_sortie = 0;
		//indice = i;
		//etat = false;	
	}
	
	public Led (int i, boolean e){
		this(i);
		etat = e;
	}
	@Override
	public void majEtat() {
		
		//test
	}

	@Override
	public boolean evalExec() {
		majEtat();
		return etat;	
	}

}
