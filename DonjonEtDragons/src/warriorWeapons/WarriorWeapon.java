package warriorWeapons;
/**
 * WarriorWeapon represente une arme de guerrier
 * @author piouk
 * @version 1.0
 */
public abstract class WarriorWeapon {
	
	
	// ATTRIBUTS
	/**
	 * name: le nom de l'arme de guerrier (type: String)
	 */
	private String name;
	/**
	 * attackPoint: le nombre de point d'attaque de l'arme de guerrier (type: int)
	 */
	private int attackPoint;
	
	
	// CONSTRUCTEURS
	/**
	 * Le constructeur permet de créer une arme de guerrier de type Sword ou Mace
	 * Attention, il est impossible d'instancier une WarriorWeapon, il faut utiliser les enfants de cette classe
	 * @param name: le nom de l'arme
	 * @param attackPoint: les points d'attaque de l'arme
	 */
	public WarriorWeapon(String name, int attackPoint) {
		this.name = name;
		this.attackPoint = attackPoint;
	}

	
	// GETTERS ET SETTERS
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAttackPoint() {
		return attackPoint;
	}

	public void setAttackPoint(int attackPoint) {
		this.attackPoint = attackPoint;
	}
	
}
