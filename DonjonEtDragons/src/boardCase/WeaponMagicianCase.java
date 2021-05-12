package boardCase;

import characters.Magician;
import characters.Personnage;
import magicianWeapons.MagicianWeapon;

/**
 * WeaponMagicianCase est une classe representant une case arme de magicien du plateau de jeu
 * @author piouk
 * @version 1.0
 */
public class WeaponMagicianCase extends BoardCase {

	
	// ATTRIBUTS
	/**
	 * Attribut power de type MagicianWeapon representant une arme de magicien (eclair ou boule de feu)
	 * chaque arme de magicien contient des points d'attaque et un nom
	 * les eclairs ou grosse boule de feu sont héritiers de la classe MagicianPower
	 */
	private MagicianWeapon power;

	
	// CONSTRUCTEURS
	/**
	 * @param power representant une arme de magicien
	 */
	public WeaponMagicianCase(MagicianWeapon power) {

		this.power = power;

	}

	
	// METHODE
	/**
	 * Méthode qui modifie l'arme du personnage magicien et augmente ses points d'attaque en conséquence
	 * Affichage dans la console  du contenue de la case arme pour magicien et du nombre de point d'attaque rajoutés au joueur
	 * Attention, un personnage de type Warrior ne peut pas récupérer cette arme
	 * @param player Le joueur qui récupère l'arme 
	 */
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