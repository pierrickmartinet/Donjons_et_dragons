package boardCase;

import characters.Personnage;

/**
 * BoardCase est une classe representant une case du plateau de jeu
 * @author piouk
 * @version 1.0
 */
public interface BoardCase {
	
	
	// METHODES
	
	/**
	 * Signature de la méthodes abstract interaction qui permet une interraction entre le contenue d'une case et le joueur
	 * @param player representant un joueur d'une partie en cours
	 */
	void interaction (Personnage player);
	
}
