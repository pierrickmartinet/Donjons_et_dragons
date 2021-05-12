package potions;
/**
 * Potion represente une potion
 * @author piouk
 * @version 1.0
 */
public abstract class Potion {
	
	// ATTRIBUTS
	/**
	 * name: le nom de la potion
	 */
	private String name;
	/**
	 * life: les points de vie de la potion
	 */
	private int life;
	
	
	// CONSTRUCTEURS
	/**
	 * Le construteur permet de créer une potion comportant des points de vie et un nom
	 * @param name: le nom de la potion
	 * @param life: les point de vie de la potion
	 */
	public Potion(String name, int life) {
		
		this.name = name;
		this.life = life;
		
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
	
	
}
