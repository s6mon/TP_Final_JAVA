package Circuit;


public abstract class $Terminaux extends $Elementaire {

	protected Etat etat;
	
	public abstract void majEtat();
	
	public Etat exec(){
		majEtat();
		return this.etat;
	}
}
