package characters;

/**
 * Personnage est une classe representant un personnage (guerrier ou magicien)
 * @author piouk
 * @version 1.0
 */
public abstract class Personnage {
	
	
	// ATTRIBUTS
	/**
	 * name : Represente le nom d'un personnage (guerrier ou magicien) (type: String)
	*/
	private String name;
	 /**
	  * life : Represente les points de vie d'un personnage (guerrier ou magicien) (type: int)
	  */
	private int life;
	/**
	 * attack : Represente les points d'attaque d'un personnage (guerrier ou magicien) (type: int)
	 */
	private int attack;
	 
	
	
	// CONSTRUCTEURS

	/**
	 * Construit un objet de type Personnage comprenant son nom, ses points de vie, ses points d'attaque et son arme
	 * Lors de l'instanciation, le Personnage n'a pas d'arme (null)
	 * Les paramètres du constructeur sont commun à toute les classes enfants de personnage
	 * @param name Le nom du Personnage
	 * @param life Les points de vie du Personnage
	 * @param attack Les points d'attaque du Personnage
	 */
	public Personnage(String name, int life, int attack) {
		this.name = name;
		this.life = life;
		this.attack = attack;
	}
	
	
	// METHODE
	/**
	 * La méthode getWeaponName() permet de retourner l'arme porté par le personnage, 
	 * s'il n'y a pas d'arme, elle retourne une String expliquant que le personnage n'a pas d'arme,
	 * sinon elle retourne le nom de l'arme du personnage
	 * @return Le nom de l'arme porté par le personnage (type: String) ou il n'y a pas d'arme (type: String)
	 */
	public abstract String getWeaponName();
	
	
	// TO STRING
	/**
	 * Methode ToString permettant d'afficher les informations d'un personnage (nom, vie, attaque et skills(pouvoir ou armes selon le personnage))
	 */
	public String toString() {
		return "Nom: " + name + ", Vie: " + life + ", Attaque: " + attack + ", Skills: " + getWeaponName();
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
	
}
