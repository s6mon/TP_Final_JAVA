package Circuit;

import java.util.ArrayList;
import java.util.HashMap;

import jus.util.assertion.Ensure;

public class Composite  extends $Circuit implements _Composant {
	
	private class Composant extends $Composant {
		
		public Composant(int nb_entree, int nb_sortie) throws Ensure {
				this.nb_entree = nb_entree;
				this.nb_sortie = nb_sortie;
				this.entrees = new PortSimple[nb_entree];
				this.sorties = new PortMultiple[nb_sortie];
				for (int i = 0; i < nb_entree; i++){
					this.entrees[i] = new PortSimple();
				}
				for (int i = 0; i < nb_sortie; i++){
					this.sorties[i] = new PortMultiple();
				}
				if(!(this.nb_entree == nb_entree && this.nb_sortie == nb_sortie)) {
					throw new Ensure ("!(this.nb_entree == nb_entree && this.nb_sortie == nb_sortie)");
				}
		}

		@Override
		public void exec() {
			Composite.this.exec();
		}
		
	}

	private Composant heritage;
	private ArrayList<Transition> transitions;
	
	public Composite(int nb_entree, int nb_sortie, ArrayList<Transition> transitions){
		this.heritage = new Composant(nb_entree, nb_sortie);
		elements = new HashMap<Integer, $Composant>();
		execList = new ArrayList<$Composant>();
		connexions = new ArrayList<Fil>();
		this.transitions = transitions;
		executable = false;
	}
	
	public Composant heritage(){
		return this.heritage;
	}

	@Override
	public boolean compConnected() {
		return heritage.compConnected();
	}

	@Override
	public PortMultiple getSorties(int i) {
		return heritage.getSorties(i);
	}

	@Override
	public PortSimple getEntree(int i) {
		return heritage.getEntree(i);
	}

	@Override
	public void majEtatPortCompSuivant() {
		heritage.majEtatPortCompSuivant();
		
	}

	@Override
	public void exec() {
		//trier puis :
		//System.out.println("\ncomposite");
		for (int i = 0; i < transitions.size(); i++){
			Transition t = transitions.get(i);
			elements.get(t.indiceComposant()).getEntree(t.numPort()).setEtat(heritage.getEntree(t.numEntree()).getEtat());
		}
		for (int i = 0; i < execList.size(); i++){
			execList.get(i).exec();
			//System.out.println(execList.get(i).getSorties(0).getEtat());
			execList.get(i).majEtatPortCompSuivant();
		}
		heritage.getSorties(0).setEtat(elements.get(execList.size()).getSorties(0).getEtat()) ;
		//System.out.println("composite\n");
	}
}
