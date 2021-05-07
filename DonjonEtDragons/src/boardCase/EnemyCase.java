package boardCase;

import characters.Personnage;
import enemy.Enemy;

public class EnemyCase extends BoardCase {

	// ATTRIBUTS
	private Enemy enemy;

	// CONSTRUCTEURS
	public EnemyCase(Enemy enemy) {

		this.enemy = enemy;

	}

	// METHODES
	@Override
	public void interaction(Personnage player) {
		// Quel ennemi se trouve sur la case
		System.out.println("c'est une case ennemie, un " + enemy.getName() + " s'y trouve");

		// Stats ennemie
		System.out.println("Voici ses stats, " + enemy);

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
}
