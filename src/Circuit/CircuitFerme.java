package Circuit;

import java.util.*;

import jus.util.assertion.Require;

public class CircuitFerme extends $Circuit{
	
	public CircuitFerme(){
		elements = new HashMap<Integer, $Composant>();
		execList = new ArrayList<$Composant>();
		connexions = new ArrayList<Fil>();
		executable = true;
	}
	
	/**
	 * Procédure pour executer le circuit.
	 * @require : this.executable
	 */
	public void exec(){
		this.setExecutable();
		if(!this.executable){throw new Require("!this.executable") ;}
		for(int i = 0; i<execList.size(); i++){
			execList.get(i).majEtatPortsEntrees();
			execList.get(i).exec();
		}
	}
	
}
