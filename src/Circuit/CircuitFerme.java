package Circuit;

import jus.util.assertion.Require;

public class CircuitFerme extends $Circuit{
	
	/**
	 * Procédure pour executer le circuit.
	 * @require : this.executable
	 */
	public void exec(){
		this.setExecutable();
		if(!this.executable){throw new Require("!this.executable") ;}
		for(int i = 0; i<elements.size(); i++){
			elements.get(i).eval();
		}
	}
	
}
