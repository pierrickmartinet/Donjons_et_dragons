package magicianWeapons;
/**
 * MagicianWeapon represente une arme de magicien 
 * @author piouk
 * @version 1.0
 */
public abstract class MagicianWeapon {
	
	// ATTRIBUTS
	/**
	 * name: le nom de l'arme de magicien (type: String)
	 */
	private String name;
	/**
	 * attackPoint: le nombre de point d'attaque de l'arme de magicien (type: int)
	 */
	private int attackPoint;
	
	
	// CONSTRUCTEURS
	/**
	 * Le constructeur permet de créer une arme de magicien de type Lightnin ou Fireball
	 * Attention, il est impossible d'instancier une MagicianWeapon, il faut utiliser les enfants de cette classe
	 * @param name: le nom de l'arme
	 * @param attackPoint: les points d'attaque de l'arme
	 */
	public MagicianWeapon(String name, int attackPoint) {
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
