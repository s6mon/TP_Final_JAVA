package Circuit;

public class PortSortie extends $Port {
	private Fil[] Sorties;
	private int nb_fil;

	public PortSortie(){
		etat = Etat.FALSE;
		nb_fil = 0;
		connected = false;
	}
	public void connect(Fil fil) {
		Sorties[nb_fil] = fil;
		nb_fil++;
		connected = true;
		
	}
	public boolean portSortieConected() {
		return connected;
	}
	
	
}
