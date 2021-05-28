package characters;

import weapon.Weapon;

/**
 * Warrior est une classe representant un personnage de type guerrier
 * @author piouk
 * @version 1.0
 */
public class Warrior extends Personnage{

	
	// ATTRIBUTS
	/**
	 * Attribut weapon de type WarriornWeapon representant une arme de guerrier (Massue ou épée)
	 * chaque arme de guerrier contient des points d'attaque et un nom
	 * les massue ou épée sont héritiers de la classe WarriorWeapon
	 */
	private String type;
	
	
	// CONSTRUCTEURS
	/**
	 * Construit un objet de type Warrior comprenant son nom, ses points de vie, ses points d'attaque et son arme
	 * Lors de l'instanciation, le guerrier n'a pas d'arme (null)
	 * @param name Le nom du guerrier
	 * @param life Les points de vie du guerrier
	 * @param attack Les points d'attaque du guerrier
	 * @param weapon L'arme du guerrier
	 */
	public Warrior(String name, int life, int attack, Weapon weapon) {
		super(name, life, attack, weapon);
		this.type = "Guerrier";
	}
	
	public Warrior() {
		
	}

	
	// METHODES
	
	public String getType() {
		return type;
	}
	
}