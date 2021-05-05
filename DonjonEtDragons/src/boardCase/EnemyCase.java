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
	
	//METHODES
	@Override
	public void interaction(Personnage player) {

		
	}

	// TO STRING
	@Override
	public String toString() {
		return "c'est une case ennemie, un " + enemy.getName() + " s'y trouve";
	}
	
}
