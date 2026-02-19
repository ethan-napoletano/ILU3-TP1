package cartes;

public class JeuDeCartes {
	private Configuration[] configurations;
	
	public JeuDeCartes(Configuration[] configurations) {
		this.configurations = configurations;
	}
	
	public String afficherJeuDeCartes() {
		String Affichage = "JeuDeCartes :\n";
		
		for(Configuration config : configurations) {
			Affichage += config.getNbExemplaires() + " " + config.getCarte().toString()+"\n"; 
					
		}
		return Affichage;
	}

}
