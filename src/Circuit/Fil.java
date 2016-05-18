package Circuit;

public class Fil {
	private int numComp1;
	private int numComp2;
	private int numPortComp1;
	private int numPortComp2;
	private PortMultiple entree; //on parle bien de port de composant d'ou l'inversion entree/sortie
	private PortSimple sortie;

	public Fil(){
		super();
	}
	
	public Fil(int a, int a1, int b, int b1){
		numComp1 = a;
		numPortComp1 = a1;
		numComp2 = b;
		numPortComp2 = b1;
	}
	
	
	public int comp1(){
		return numComp1;
	}
	
	public int comp2(){
		return numComp2;
	}
	
	public int portComp1(){
		return numPortComp1;
	}
	
	public int portComp2(){
		return numPortComp2;
	}
	
	public boolean equal(Fil f){
		return (this.comp1()==f.comp1() && this.comp2()==f.comp2() && this.portComp1()==f.portComp1() && this.portComp2()==f.portComp2());
	}
	
	public PortMultiple getEntree(){
		return entree;
	}
	
	public PortSimple getSortie(){
		return sortie;
	}
		
	public void brancher(PortMultiple entree, PortSimple sortie){
		this.entree = entree;
		this.sortie = sortie;
		this.sortie.connect(this);
		this.entree.connect(this);
	}
	
	public void affiche(){
		System.out.println("(" + numComp1 + ", " + numPortComp1 + ") (" + numComp2 + ", " + numPortComp2 + ")");}
}
