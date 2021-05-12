package enemy;

/**
 * Wizard est une classe representant un ennemie de type mage
 * Le mage dispose de 9 point de vie et 2 point d'attaque à renseigner lors de l'instanciation dans les paramètres
 * @author piouk
 * @version 1.0
 */
public class Wizard extends Enemy {

	
	// CONSTRUCTEURS
	/**
	 * Le constructeur permet de créer un objet enemmie de type Wizard en lui affiliant des points de vie, d'attaque et un nom
	 * @param name Le nom du mage
	 * @param life Les points de vie du mage (9 pv)
	 * @param attack Les points d'attaque du mage (2 pa)
	 */
	public Wizard(String name, int life, int attack) {
		
		super(name, life, attack);

	}

}
