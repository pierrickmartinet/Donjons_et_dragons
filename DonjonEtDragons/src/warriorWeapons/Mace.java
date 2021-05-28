package warriorWeapons;
/**
 * Mace represente une arme de type guerrier de type massue
 * @author piouk
 * @version 1.0
 */
public class Mace extends WarriorWeapon{

	
	// CONSTRUCTEURS
	/**
	 * Le constructeur permet de créer une arme de guerrier de type massue
	 * @param name: le nom de l'arme (massue)
	 * @param attackPoint: les point d'attaque de l'arme (3 pa)
	 */
	public Mace(String name, int attackPoint) {
		
		super(name, attackPoint);

	}

	@Override
	public String type() {
		return "mace";
	}

}
