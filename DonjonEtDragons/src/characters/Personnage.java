package characters;

import weapon.Weapon;

/**
 * Personnage est une classe representant un personnage (guerrier ou magicien)
 * 
 * @author piouk
 * @version 1.0
 */
public abstract class Personnage {

	// ATTRIBUTS
	/**
	 * name : Represente le nom d'un personnage (guerrier ou magicien) (type:
	 * String)
	 */
	private String name;
	/**
	 * life : Represente les points de vie d'un personnage (guerrier ou magicien)
	 * (type: int)
	 */
	private int life;
	/**
	 * attack : Represente les points d'attaque d'un personnage (guerrier ou
	 * magicien) (type: int)
	 */
	private int attack;
	
	private Weapon weapon;
	

	// CONSTRUCTEURS

	/**
	 * Construit un objet de type Personnage comprenant son nom, ses points de vie,
	 * ses points d'attaque et son arme Lors de l'instanciation, le Personnage n'a
	 * pas d'arme (null) Les paramètres du constructeur sont commun à toute les
	 * classes enfants de personnage
	 * 
	 * @param name   Le nom du Personnage
	 * @param life   Les points de vie du Personnage
	 * @param attack Les points d'attaque du Personnage
	 */
	public Personnage(String name, int life, int attack, Weapon weapon) {
		this.name = name;
		this.life = life;
		this.attack = attack;
		this.weapon = weapon;
	}
	
	public Personnage() {
		
	}

	// METHODE


	public abstract String getType();

	// TO STRING
	/**
	 * Methode ToString permettant d'afficher les informations d'un personnage (nom,
	 * vie, attaque et skills(pouvoir ou armes selon le personnage))
	 */
	@Override
	public String toString() {

		if (weapon == null) {
			
		return  "                                                     STATS\n" + "\n" +
				">>>>>----------------------->" + " | Nom : " + name + " | Vie: " + life + " | Attaque: " + attack + " | Skills:  Pas d'arme | <-----------------------<<<<<";
		} else {
			return  "                                                     STATS\n" + "\n" +
					">>>>>----------------------->" + " | Nom : " + name + " | Vie: " + life + " | Attaque: " + attack + " | Skills: " + weapon.getName() + " | <-----------------------<<<<<";
		}
		
	}

	// GETTERS ET SETTERS
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getLife() {
		return life;
	}

	public void setLife(int life) {
		this.life = life;
	}

	public int getAttack() {
		return attack;
	}

	public void setAttack(int attack) {
		this.attack = attack;
	}

	public Weapon getWeapon() {
		return weapon;
	}

	public void setWeapon(Weapon weapon) {
		this.weapon = weapon;
	}


}
