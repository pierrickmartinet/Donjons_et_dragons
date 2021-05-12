package boardCase;

import characters.Personnage;
import characters.Warrior;
import warriorWeapons.WarriorWeapon;

/**
 * WeaponWarriorCase est une classe representant une case arme de warrior du plateau de jeu
 * @author piouk
 * @version 1.0
 */
public class WeaponWarriorCase extends BoardCase {

	
	// ATTRIBUTS
	/**
	 * Attribut warriorWeapon de type WarriorWeapon representant une arme de guerrier (massue ou épée)
	 * chaque arme de guerrier contient des points d'attaque et un nom
	 * les massues et épées sont héritiers de la classe WarriorWeapon
	 */
	private WarriorWeapon warriorWeapon;

	
	// CONSTRUCTEURS
	/**
	 * @param warriorWeapon representant une arme de guerrier
	 */
	public WeaponWarriorCase(WarriorWeapon warriorWeapon) {

		this.warriorWeapon = warriorWeapon;

	}

	
	// METHODES
	/**
	 * Méthode qui modifie l'arme du personnage guerrier et augmente ses points d'attaque en conséquence
	 * Affichage dans la console  du contenue de la case arme pour guerrier et du nombre de point d'attaque rajoutés au joueur
	 * Attention, un personnage de type Magician ne peut pas récupérer cette arme
	 * @param player Le joueur qui récupère l'arme
	 */
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
