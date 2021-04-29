package characters;

public class Warriors {

	
	// Attributs
	private String name;
	private int life;
	private int attack;
	
	
	// Constructeurs
	
	public Warriors() {
		name=null;
		life=5;
		attack=5;
	}
	
	public Warriors(String name) {
		// Ce name (attribut de la class), prend la valeur de name (variable paramètre)
		this.name=name;
		life=5;
		attack=5;
	}
	
	public Warriors(String name, int life, int attack) {
		this.name = name;
		this.life = life;
		this.attack = attack;
	}
	
	

	
	
	// Getters et Setters
	
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

	// Fonction toString
	public String toString() {
		return "Warrior name: " + name + ", life: " + life + ", attack: " + attack;
	}

}