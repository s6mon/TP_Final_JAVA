package Circuit;

import java.util.ArrayList;

public class Main {
	
	public static void main(String[] args){
		CircuitFerme c = new CircuitFerme();

		ArrayList<Fil>list = new ArrayList<Fil>();
		
		list.clear();		
		list.add(new Fil(1, 0, 6, 0));
		list.add(new Fil(1, 0, 3, 0));
		c.ajouterComp(new Vcc(), 1, list);
		
		list.clear();	
		list.add(new Fil(2, 0, 4, 0));
		list.add(new Fil(2, 0, 5, 0));
		c.ajouterComp(new Gcc(), 2, list);
		
		list.clear();	
		list.add(new Fil(3, 0, 5,1));
		c.ajouterComp(new Non(), 3, list);
		
		list.clear();	
		list.add(new Fil(4, 0, 6, 1));
		c.ajouterComp(new Non(), 4, list);
		
		list.clear();	
		list.add(new Fil(5, 0, 7, 0));
		c.ajouterComp(new Et(), 5, list);
		
		list.clear();	
		list.add(new Fil(6, 0, 7, 1));
		c.ajouterComp(new Et(), 6, list);
		
		list.clear();	
		list.add(new Fil(7, 0, 8, 0));
		c.ajouterComp(new Ou(), 7, list);
		
		c.ajouterComp(new Led(), 8);
		
		c.connect();
		
		for (int i = 0; i<c.connexions.size(); i++){
			c.connexions.get(i).affiche();
		}
		c.exec();
	}
}
