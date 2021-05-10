package boardCase;

import characters.Personnage;

public class EmptyCase extends BoardCase {
	
	
	// METHODES

	@Override
	public void interaction(Personnage player) {
		
	System.out.println("C'est une case vide, ouf !");
	
	}

}
