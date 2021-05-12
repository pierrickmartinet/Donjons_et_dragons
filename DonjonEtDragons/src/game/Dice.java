package game;

/**
 * Dice represente un dé random de 6 faces
 * @author piouk
 * @version 1.0
 */
public class Dice {

	// ATTRIBUTS
	/**
	 * dice : entier dé
	 */
	private int dice;

	
	// CONSTRUCTEUR
	/**
	 * Le constructeur permet de créder un dé avec la valeur par défaut 0
	 */
	public Dice() {
		dice = 0;
	}
	
	
	// METHODES
	/**
	 * La méthode throwDice() permet d'affecter au dé un chiffre random entre 1 et 6
	 */
	public void throwDice() {
		
		int min = 1;
		int max = 6;
		dice = min + (int) (Math.random() * ((max - min) + 1));

	}


	// GETTERS ET SETTERS
	public int getDice() {
		return dice;
	}

	public void setDice(int dice) {
		this.dice = dice;
	}
	
}
