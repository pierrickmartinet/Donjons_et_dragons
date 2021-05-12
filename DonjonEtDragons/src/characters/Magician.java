package characters;

import magicianWeapons.MagicianWeapon;

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
	private MagicianWeapon power;
	
	
	// CONSTRUCTEURS
	/**
	 * Construit un objet de type Magicien comprenant son nom, ses points de vie, ses points d'attaque et son arme
	 * Lors de l'instanciation, le magicien n'a pas d'arme (null)
	 * @param name Le nom du magicien
	 * @param life Les points de vie du magicien
	 * @param attack Les points d'attaque du magicien
	 * @param power L'arme du magicien
	 */
	public Magician(String name, int life, int attack, MagicianWeapon power) {
		super(name, life, attack);
		this.power = power;
		
	}

	
	// METHODES
	/**
	 * Méthode qui retourne l'arme du magicien
	 */
	public String getWeaponName() {
		if (power != null) {
			return power.getName();
		} else {
			return "Vous n'avez aucun pouvoir";
		}
	}
	
	
	// GETTERS ET SETTERS
	public MagicianWeapon getPower() {
		return power;
	}

	public void setPower(MagicianWeapon power) {
		this.power = power;
	}
	

}
