package boardCase;

import characters.Personnage;
import characters.Warrior;
import warriorWeapons.WarriorWeapon;

public class WeaponWarriorCase extends BoardCase {

	// ATTRIBUTS
	private WarriorWeapon warriorWeapon;

	// CONSTRUCTEURS
	public WeaponWarriorCase(WarriorWeapon warriorWeapon) {

		this.warriorWeapon = warriorWeapon;

	}

	// METHODES
	@Override
	public void interaction(Personnage player) {

		if (player instanceof Warrior) {

			// Modifie l'arme du guerrier
			((Warrior) player).setWeapon(warriorWeapon);
			// Augmente l'attaque selon l'attaque de base
			player.setAttack(5 + warriorWeapon.getAttackPoint());
			// Affichage
			System.out.println("c'est une case arme pour guerrier, une " + warriorWeapon.getName()
					+ " s'y trouve, tu la récupère et gagne " + warriorWeapon.getAttackPoint()
					+ " points d'attaque !!");
		} else {
			System.out.println("c'est une case arme pour guerrier, c'est pas pour les magiciens, file !");
		}
	}

}
