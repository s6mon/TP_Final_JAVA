package Circuit;

public class Vcc extends Generateur{
	
	public Vcc (int i, boolean e){

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
