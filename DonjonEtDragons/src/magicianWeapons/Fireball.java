package magicianWeapons;

/**
 * Fireball represente une arme de type magicien de type boule de feu
 * @author piouk
 * @version 1.0
 */
public class Fireball extends MagicianWeapon {

	
	// CONSTRUCTEURS
	/**
	 * Le constructeur permet de créer une arme de magicien de type boule de feu
	 * @param name: le nom de l'arme (boule de feu)
	 * @param attackPoint: les point d'attaque de l'arme (7 pa)
	 */
	public Fireball(String name, int attackPoint) {
		
		super(name, attackPoint);

	}

	@Override
	public String type() {
		return "fireball";
	}

}
