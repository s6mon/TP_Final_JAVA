package Circuit;
import java.util.ArrayList;

public class PortMultiple extends $Port {
	private ArrayList<Fil> sorties;

	public PortMultiple(){
		sorties = new ArrayList<Fil>();
		etat = Etat.FALSE;
		connected = false;
	}
	public void connect(Fil fil) {
		sorties.add(fil);
		connected = true;
		
	}
	public boolean portSortieConected() {
		return connected;
	}
	
	public void propageEtat(){
		for (int i = 0; i < sorties.size(); i++){
			sorties.get(i).getSortie().setEtat(this.getEtat());
			//System.out.println(this.etat);
		}
	}
	
	public Fil getSortie(int i){
		return sorties.get(i);
	}
}
