package boardCase;

import characters.Personnage;
import potions.Potion;

public class PotionCase extends BoardCase {
	
	// ATTRIBUTS
	private Potion potion;

	
	// CONSTRUCTEURS
	public PotionCase(Potion potion) {
		
		this.potion = potion;
		
	}

	// METHODES
	@Override
	public void interaction(Personnage player) {
		
		// Ajout de vie au personnage
		player.setLife(player.getLife() + potion.getLife());
		// Affichage contenue case
		System.out.println("c'est une case potion, une " + potion.getName() + " s'y trouve, tu gagnes " + potion.getLife() + " point de vie !!");
		
	}	
	
}
