package boardCase;

import characters.Personnage;
import potions.Potion;

/**
 * PotionCase est une classe representant une case potion du plateau de jeu
 * @author piouk
 * @version 1.0
 */
public class PotionCase extends BoardCase {
	
	// ATTRIBUTS
	/**
	 * Attribut potion de type Potion representant une potion (potion standard ou grosse potion)
	 * chaque potion dispose de point de vie et d'un nom
	 * les potions standard ou grosse potion sont héritiers de la classe Potion
	 */
	private Potion potion;

	
	// CONSTRUCTEURS
	/**
	 * Lors de l'instanciation d'un objet PotionCase, la potion passé en paramètre de ce constructeur devient la potion de la classe PotionCase
	 * @param potion representant une potion
	 */
	public PotionCase(Potion potion) {
		
		this.potion = potion;
		
	}

	// METHODES
	/**
	 *  Rajout de vie au joueur et affichage dans la console du nom de la potion et nombre de point de vie qu'elle contient
	 *  Affichage dans la console du contenue de la case potion et du nombre de point de vie rajoutés au joueur
	 */
	public void interaction(Personnage player) {
		
		// Ajout de vie au personnage
		player.setLife(player.getLife() + potion.getLife());
		// Affichage contenue case
		System.out.println("c'est une case potion, une " + potion.getName() + " s'y trouve, tu gagnes " + potion.getLife() + " point de vie !!");
		
	}	
	
}
