package boardCase;

import characters.Personnage;

public class EmptyCase extends BoardCase {
	
	// ATTRIBUTS
	private String caseVide = "c'est une case est vide";

	
	// METHODES

	@Override
	public void interaction(Personnage player) {
		
		
	}
	
	// TO STRING
	@Override
	public String toString() {
		return caseVide;
	}

}
