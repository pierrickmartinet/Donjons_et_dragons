package enemy;

/**
 * Enemy est une classe representant un ennemie elle permet d'instancier ses enfants qui sont les différents ennemies du jeu
 * Les enfants d'Enemy peuvent être de type Dragon, Goblin ou Wizard
 * Les différents ennemies disponible dans le jeu sont tous composés d'un nom, de point de vie et de point d'attaque différent
 * @author piouk
 * @version 1.0
 */
public abstract class Enemy {
	
	// ATTRIBUTS
	/**
	 * name: le nom de l'ennemi (type: String)
	 */
	private String name;
	/**
	 * life: les point de vie de l'ennemi (type: int)
	 */
	private int life;
	/**
	 * attack: les points d'attaque d'un ennemi (type: int)
	 */
	private int attack;
	
	
	// CONSTRUCTEURS
	/**
	 * Le constructeur permet d'instancier un ennemi en lui affiliant un nom, des points de vies et des points d'attaque
	 * @param name le nom de l'ennemi
	 * @param life les points de vie de l'ennemi
	 * @param attack les point d'attaque de l'ennemi
	 */
	public Enemy(String name, int life, int attack) {
		this.name = name;
		this.life = life;
		this.attack = attack;
	}

	
	// METHODES
	
	/**
	 * La méthode infoNameEnemy() permet de renvoyer le nom d'un ennemi
	 * @return String renvoyant le nom d'un ennemi se trouvant sur une case
	 */
	public String infoNameEnemy() {
		// Quel ennemi se trouve sur la case
		return "c'est une case ennemie, un " + name + " s'y trouve";
	}
	
	/**
	 * La méthode infoStatEnemy() permet de renvoyer les stats d'un enemmi
	 * @return String renvoyant les stats d'un ennemi se trouvant sur une case
	 */
	public String infoStatEnemy() {
		return "Nom: " + name + ", Vie: " + life + ", Attaque: " + attack;
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
