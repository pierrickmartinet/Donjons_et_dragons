package characters;

public class Warriors {

	
	// Attributs
	private String name;
	private int life;
	private int attack;
	private String bouclier;
	
	
	// Constructeurs
	
	public Warriors() {
		name=null;
		life=5;
		attack=5;
		bouclier="bouclier"; 
	}
	
	public Warriors(String name) {
		// Ce name (attribut de la class), prend la valeur de name (variable paramètre)
		this.name=name;
		life=5;
		attack=5;
		bouclier="bouclier";
	}
	
	public Warriors(String name, int life, int attack, String bouclier) {
		this.name = name;
		this.life = life;
		this.attack = attack;
		this.bouclier=bouclier;
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
		return "Personnage: Warrior Name: " + name + ", Life: " + life + ", Attack: " + attack + ", Boublier: " + bouclier;
	}

}