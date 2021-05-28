package magicianWeapons;

import weapon.Weapon;

/**
 * MagicianWeapon represente une arme de magicien 
 * @author piouk
 * @version 1.0
 */
public abstract class MagicianWeapon extends Weapon {
	
	
	// CONSTRUCTEURS
	/**
	 * Le constructeur permet de créer une arme de magicien de type Lightnin ou Fireball
	 * Attention, il est impossible d'instancier une MagicianWeapon, il faut utiliser les enfants de cette classe
	 * @param name: le nom de l'arme
	 * @param attackPoint: les points d'attaque de l'arme
	 */
	public MagicianWeapon(String name, int attackPoint) {
		super(name,attackPoint);
	}
	
}
