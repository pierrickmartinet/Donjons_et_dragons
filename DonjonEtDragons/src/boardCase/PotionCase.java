package boardCase;

import potions.Potion;

public class PotionCase extends BoardCase {
	
	// ATTRIBUTS
	private Potion potion;

	
	// CONSTRUCTEURS
	public PotionCase(Potion potion) {
		
		this.potion = potion;
		
	}


	// TO STRING
	@Override
	public String toString() {
		return "c'est une case potion, une " + potion.getName() + " s'y trouve";
	}
	
	
}
