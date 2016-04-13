package Circuit;

public abstract class $Port {
	protected Etat etat;
	protected boolean connected;
	
	public Etat getEtat(){return etat;}
	
	public void setEtat(Etat e){etat = e;}
}
