package cartes;

public class Borne extends Carte {
	
	private int Km;
	
	public Borne(int Km) {
		this.Km = Km;
	}
	
	public int getKm() {
		return Km;
	}
	
	@Override
	public String toString() {
		return Km + " km";
	}

}
