package exceptions;

/**
 * PersonnageHorsPlateauException est une classe permettant de créer une exception lorsque le player est hors du plateau
 * @author piouk
 * @version 1.0
 */
public class PersonnageHorsPlateauException extends Exception {
	
	/**
	 * Lors de la création de l'exception celle ci retourne un message personnalisé
	 * @param message Le message à afficher (type: String)
	 */
	public PersonnageHorsPlateauException(String message) {
		
		super(message);
		
	}

}
