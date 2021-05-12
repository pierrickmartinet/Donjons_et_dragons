package potions;
/**
 * StandardPotion represente une potion de type StandardPotion
 * @author piouk
 * @version 1.0
 */
public class StandardPotion extends Potion {

	// CONSTRUCTEURS
	/**
	 * Le constructeur permet de construire une potion standard de type potion comprenant un nom et des points de vie
	 * @param name: le nom de la potion standard (potion standard)
	 * @param life: les points de vie de la grosse potion (2pv)
	 */
	public StandardPotion(String name, int life) {
		
		super(name, life);

	}

}
