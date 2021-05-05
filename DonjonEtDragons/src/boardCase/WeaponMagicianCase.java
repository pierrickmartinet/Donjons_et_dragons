package boardCase;

import characters.Magician;
import characters.Personnage;
import characters.Warrior;
import magicianWeapons.MagicianWeapon;

public class WeaponMagicianCase extends BoardCase {

	// ATTRIBUTS
	private MagicianWeapon power;

	// CONSTRUCTEURS
	public WeaponMagicianCase(MagicianWeapon power) {

		this.power = power;

	}

	// METHODE
	@Override
	public void interaction(Personnage player) {

		if (player instanceof Magician) {

			// Modifie l'arme du guerrier
			((Magician) player).setPower(power);
			// Augmente l'attaque selon l'attaque de base
			player.setAttack(3 + power.getAttackPoint());
			// Affichage
			System.out.println("c'est une case arme pour magicien, une " + power.getName()
					+ " s'y trouve, tu la récupère et gagne " + power.getAttackPoint()
					+ " points d'attaque !!");
		} else {
			System.out.println("c'est une case arme pour magicien, c'est pas pour les guerriers, file !");
		}
	}
}
