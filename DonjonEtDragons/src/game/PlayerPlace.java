package game;
/**
 * PlayerPlace represente la position d'un joueur
 * @author piouk
 * @version 1.0
 */
public class PlayerPlace {
	
	// ATTRIBUTS
	/**
	 * playerPlace: entier representant la position d'un joueur
	 */
	private int playerPlace;
	
	
	// CONSTRUCTEURS
	/**
	 * Le constructeur permet d'instancier PlayerPlace avec une position de départ à 0
	 */
	public PlayerPlace () {
		
		playerPlace = 0;
		
	}

	
	// GETTERS ET SETTERS
	public int getPlayerPlace() {
		return playerPlace;
	}

	public void setPlayerPlace(int playerPlace) {
		this.playerPlace = playerPlace;
	}
	
	

}
