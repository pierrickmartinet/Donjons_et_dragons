package magicianWeapons;
/**
 * Lightning represente une arme de type magicien de type eclair
 * @author piouk
 * @version 1.0
 */
public class Lightning extends MagicianWeapon {


	// CONSTRUCTEURS
	/**
	 * Le constructeur permet de créer une arme de magicien de type eclair
	 * @param name: le nom de l'arme (éclair)
	 * @param attackPoint: les point d'attaque de l'arme (2 pa)
	 */
	public Lightning(String name, int attackPoint) {
		
		super(name, attackPoint);

	}

	@Override
	public String type() {
		return "lightning";
	}

}
