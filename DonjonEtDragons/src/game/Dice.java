package game;

public class Dice {

	// ATTRIBUTS
	
	// Dés
	private int dice;

	// CONSTRUCTEUR
	public Dice() {
		dice = dice();
	}
	
	// METHODES
	
	// Fonction qui lance un dés virtuel et renvoie un chiffre random entre 1 et 6
	public int dice() {
		
		int min = 1;
		int max = 6;

		int randomValue = min + (int) (Math.random() * ((max - min) + 1));

		return randomValue;
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
