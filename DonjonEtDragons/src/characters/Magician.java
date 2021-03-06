package characters;

import weapon.Weapon;

/**
 * Magician est une classe representant un personnage de type magicien
 * @author piouk
 * @version 1.0
 */
public class Magician extends Personnage{
	
	
	// ATTRIBUTS
	/**
	 * Attribut power de type MagicianWeapon representant une arme de magicien (eclair ou boule de feu)
	 * chaque arme de magicien contient des points d'attaque et un nom
	 * les eclairs ou grosse boule de feu sont héritiers de la classe MagicianWeapon
	 */
	private String type; 
	
	
	// CONSTRUCTEURS
	/**
	 * Construit un objet de type Magicien comprenant son nom, ses points de vie, ses points d'attaque et son arme
	 * Lors de l'instanciation, le magicien n'a pas d'arme (null)
	 * @param name Le nom du magicien
	 * @param life Les points de vie du magicien
	 * @param attack Les points d'attaque du magicien
	 * @param power L'arme du magicien
	 */
	public Magician(String name, int life, int attack, Weapon weapon) {
		super(name, life, attack, weapon);
		this.type = "Magicien";
	}
	
	public Magician() {
		
	}

	
	// METHODES
	
	public String getType() {
		return type;
	}
	
}
