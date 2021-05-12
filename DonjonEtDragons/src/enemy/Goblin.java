package enemy;

/**
 * Goblin est une classe representant un ennemie de type gobelin
 * Le gobelin dispose de 6 point de vie et 1 point d'attaque à renseigner lors de l'instanciation dans les paramètres
 * @author piouk
 * @version 1.0
 */
public class Goblin extends Enemy {

	
	// CONSTRUCTEURS
	/**
	 * Le constructeur permet de créer un objet enemmie de type Goblin en lui affiliant des points de vie, d'attaque et un nom
	 * @param name Le nom du gobelin
	 * @param life Les points de vie du gobelin (6 pv)
	 * @param attack Les points d'attaque du gobelin (1 pa)
	 */
	public Goblin(String name, int life, int attack) {
		
		super(name, life, attack);

	}

}
