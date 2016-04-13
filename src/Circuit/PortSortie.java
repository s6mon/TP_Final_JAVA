package Circuit;
import java.util.ArrayList;

public class PortSortie extends $Port {
	private ArrayList<Fil> Sorties;

	public PortSortie(){
		Sorties = new ArrayList<Fil>();
		etat = Etat.FALSE;
		connected = false;
	}
	public void connect(Fil fil) {
		Sorties.add(fil);
		connected = true;
		
	}
	public boolean portSortieConected() {
		return connected;
	}
	
	
}
