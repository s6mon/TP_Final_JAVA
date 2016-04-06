package Circuit;


public abstract class $Terminaux extends $Elementaire {

	protected boolean etat;
	
	public abstract void majEtat();
	
	public boolean exec(){
		majEtat();
		return this.etat;
	}
}
