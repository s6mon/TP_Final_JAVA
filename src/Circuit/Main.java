package Circuit;

import java.util.ArrayList;

public class Main {
	
	public static void main(String[] args){
		CircuitFerme c = new CircuitFerme();
		
		ArrayList<Transition> transitions = new ArrayList<Transition>();
		ArrayList<Fil>list = new ArrayList<Fil>();
		
		list.clear();		
		list.add(new Fil(1, 0, 3, 0));
		c.ajouterComp(new Vcc(), 1, list);
		
		list.clear();	
		list.add(new Fil(2, 0, 3, 1));
		c.ajouterComp(new Vcc(), 2, list);
		
		transitions.add(new Transition(0, 1, 0));
		transitions.add(new Transition(0, 4, 0));
		transitions.add(new Transition(1, 3, 0));
		transitions.add(new Transition(1, 2, 0));
		Composite oux = new Composite(2, 1, transitions);
		
		list.clear();	
		list.add(new Fil(1, 0, 3, 1));
		oux.ajouterComp(new Non(), 1, list);
		
		list.clear();	
		list.add(new Fil(2, 0, 4, 1));
		oux.ajouterComp(new Non(), 2, list);
		
		list.clear();	
		list.add(new Fil(3, 0, 5, 0));
		oux.ajouterComp(new Et(), 3, list);
		
		list.clear();	
		list.add(new Fil(4, 0, 5, 1));
		oux.ajouterComp(new Et(), 4, list);
			
		oux.ajouterComp(new Ou(), 5);
		
		list.clear();
		list.add(new Fil(3, 0, 4, 0));
		c.ajouterComp(oux.heritage(), 3, list);
		
		c.ajouterComp(new Led(), 4);
		
		c.connect();
		oux.connect();
		
		for (int i = 0; i<c.connexions.size(); i++){
			c.connexions.get(i).affiche();
		}
		c.exec();
	}
}
