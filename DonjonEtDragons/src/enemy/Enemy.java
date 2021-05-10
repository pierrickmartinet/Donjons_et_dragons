package enemy;

public abstract class Enemy {
	
	// ATTRIBUTS
	private String name;
	private int life;
	private int attack;
	
	
	// CONSTRUCTEURS
	public Enemy(String name, int life, int attack) {
		this.name = name;
		this.life = life;
		this.attack = attack;
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

	
	// METHODES
	
	public String infoNameEnemy() {
		// Quel ennemi se trouve sur la case
		return "c'est une case ennemie, un " + name + " s'y trouve";
	}
	
	public String infoStatEnemy() {
		return "Nom: " + name + ", Vie: " + life + ", Attaque: " + attack;
	}
	

}
