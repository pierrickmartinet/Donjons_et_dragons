package game;

public class Dice {

	// ATTRIBUTS
	
	// Dés
	private int dice;

	// CONSTRUCTEUR
	public Dice() {
		dice = 0;
	}
	
	// METHODES
	
	// Fonction qui lance un dés virtuel et renvoie un chiffre random entre 1 et 6
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
	
	// METHODE TO STRING
	@Override
	public String toString() {
		return "dice";
	}
	
	
	
}
