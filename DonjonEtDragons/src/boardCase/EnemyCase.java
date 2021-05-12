package boardCase;

import characters.Personnage;
import enemy.Enemy;

/**
 * EnemyCase est une classe representant une case ennemie du plateau de jeu
 * @author piouk
 * @version 1.0
 */
public class EnemyCase extends BoardCase {

	// ATTRIBUTS
	/**
	 * Attribut enemy de type Enemy representant un ennemi (dragon, gobelin ou mage)
	 * chaque ennemie dispose de point de vie, de point d'attaque et d'un nom
	 * les dragons, gobelins et mage sont héritiers de la classe Enemy
	 */
	private Enemy enemy;
	

	// CONSTRUCTEURS
	/**
	 * Lors de l'instanciation d'un objet EnemyCase, l'ennemie passé en paramètre de ce constructeur devient l'ennemie de la classe EnemyCase
	 * @param enemy representant un ennemie sur une case ennemie
	 */
	public EnemyCase(Enemy enemy) {

		this.enemy = enemy;

	}
	

	// METHODES
	/**
	 *  Méthode representant un combat entre joueur et ennemies
	 *  Le joueur attaque en premier, s'il bat l'énnemie, le combat s'arrête et le jeu continu
	 *  Sinon l'ennemie attaque le joueur et ainsi de suite jusqu'à ce que le joueur ou l'ennemie n'ai plus de PV
	 *  Si le joueur n'a plus de PV, le jeu s'arrête
	 *  @param player Le joueur qui combat un ennemie
	 */
	public void interaction(Personnage player) {

		// Tant que le joueur et l'ennemi ont des point de vie supérieur à zéro
		while ((player.getLife()) > 0 && (enemy.getLife() > 0)) {

			// Le joueur attaque et fait perdre des points de vie à l'ennemi
			enemy.setLife(enemy.getLife() - player.getAttack());
			System.out.println("Vous attaquez le " + enemy.getName() + " ! joli coup ! - " + player.getAttack()
					+ " points de vie");

			// Si l'ennemi n'est pas mort, il va pouvoir attaquer
			if (enemy.getLife() > 0) {
				// Nombre de pv ennemie restant
				System.out.println("il lui reste " + enemy.getLife() + " pv ! courage !");
				// L'ennemi attaque et fait perdre des points de vie au joueur
				player.setLife(player.getLife() - enemy.getAttack());
				System.out.println("Oups ! l'ennemie vous fait perdre " + enemy.getAttack() + " points de vie");
				if (player.getLife() > 0) {
					System.out.println("il vous reste " + player.getLife() + " pv");
				}
			}

			if (player.getLife() <= 0) {
				System.out.println("l'ennemi vous à térrassé ! Vous avez perdu la partie !");
				System.exit(0);

			} else if (enemy.getLife() <= 0) {
				System.out.println("Vous aves vaincu ce fichu " + enemy.getName() + " félicitation !");
			}
		}
	}

	
	// GETTERS ET SETTERS

	public Enemy getEnemy() {
		return enemy;
	}


	public void setEnemy(Enemy enemy) {
		this.enemy = enemy;
	}
	
}
