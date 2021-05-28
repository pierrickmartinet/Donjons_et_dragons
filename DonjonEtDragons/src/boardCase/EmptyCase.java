package boardCase;

import characters.Personnage;

/**
 * EmptyCase est une classe representant une case vide du plateau de jeu
 * @author piouk
 * @version 1.0
 */
public class EmptyCase implements BoardCase {
	
	
	// METHODES

	/**
	 * Affichage d'une case vide dans la console
	 * @param player Le joueur sur une case vide
	 */
	public void interaction(Personnage player) {
		
	System.out.println("C'est une case vide, ouf !");
	
	}

}
