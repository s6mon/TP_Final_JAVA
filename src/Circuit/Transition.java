package Circuit;

public class Transition {
	private int numEntree;
	private int indiceComposant;
	private int numPort;
	
	public Transition(int numEntree, int indiceComposant, int numPort){
		this.numEntree = numEntree;
		this.indiceComposant = indiceComposant;
		this.numPort = numPort;
	}
	
	public int numEntree(){
		return this.numEntree;
	}
	
	public int indiceComposant(){
		return this.indiceComposant;
	}
	
	public int numPort(){
		return this.numPort;
	}
}
