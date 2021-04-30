package characters;

public class Magician {
	
	// Attributs
	private String name;
	private int life;
	private int attack;
	private String philtres;
	
	
	// Constructeurs
	public Magician() {
		name = null;
		life = 5;
		attack = 5;
		philtres = "philtres";
	}
	
	public Magician(String name) {
		this.name = name;
		life = 5;
		attack = 5;
		philtres = "philtres";
	}
	
	public Magician(String name, int life, int attack, String philtres) {
		this.name = name;
		this.life = life;
		this.attack = attack;
		this.philtres = philtres;
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
		return "Personnage: Magicien Name: " + name + ", Life: " + life + ", Attack: " + attack + ", Philtres: " + philtres;
	}

}
