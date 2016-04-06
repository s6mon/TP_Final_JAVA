package Circuit;

public class PortSortie extends $Port {
	private Fil[] Sorties;
	private int nb_fil;

	public PortSortie(){
		etat = Etat.FALSE;
		nb_fil = 0;
	}
	public void setFilPort(Fil fil) {
		Sorties[nb_fil] = fil;
		nb_fil++;
		
	}
	
	
}
