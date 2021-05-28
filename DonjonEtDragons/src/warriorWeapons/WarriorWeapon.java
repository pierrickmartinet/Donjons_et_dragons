package warriorWeapons;

import weapon.Weapon;

/**
 * WarriorWeapon represente une arme de guerrier
 * @author piouk
 * @version 1.0
 */
public abstract class WarriorWeapon extends Weapon {
	
	
	// CONSTRUCTEURS
	/**
	 * Le constructeur permet de créer une arme de guerrier de type Sword ou Mace
	 * Attention, il est impossible d'instancier une WarriorWeapon, il faut utiliser les enfants de cette classe
	 * @param name: le nom de l'arme
	 * @param attackPoint: les points d'attaque de l'arme
	 */
	public WarriorWeapon(String name, int attackPoint) {
		super(name, attackPoint);
	}

}
