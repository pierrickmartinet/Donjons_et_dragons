package enemy;

/**
 * Dragon est une classe representant un ennemie de type dragon
 * Le dragon dispose de 15 point de vie et 4 point d'attaque à renseigner lors de l'instanciation dans les paramètres
 * @author piouk
 * @version 1.0
 */
public class Dragon extends Enemy {

	
	// CONSTRUCTEURS
	/**
	 * Le constructeur permet de créer un objet enemmie de type Dragon en lui affiliant des points de vie, d'attaque et un nom
	 * @param name Le nom du dragon
	 * @param life Les points de vie du dragon (15 pv)
	 * @param attack Les points d'attaque du dragon (4 pa)
	 */
	public Dragon(String name, int life, int attack) {

		super(name, life, attack);

	}

}
