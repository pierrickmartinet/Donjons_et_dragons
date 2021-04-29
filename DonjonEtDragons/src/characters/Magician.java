package characters;

public class Magician {
	
	// Attributs
	private String name;
	private String img;
	private int life;
	private int attack;
	
	
	// Constructeurs
	public Magician() {
		
	}
	
	public Magician(String name) {
		
	}
	
	public Magician(String name, String img, int life, int attack) {
		
	}
	
	
	// Getters et Setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
	public String getImg() {
		return img;
	}

	public void setImg(String img) {
		this.img = img;
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
