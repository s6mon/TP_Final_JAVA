package Circuit;

public abstract class $Port {
	protected Etat etat;
	protected boolean connected;
	protected $Composant comp;
	
	public $Composant comp(){
		return comp;
	}
	
	public Etat getEtat(){return etat;}
	
	public void setEtat(Etat e){etat = e;}
}
