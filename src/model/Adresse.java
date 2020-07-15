/**
 * 
 */
package model;

/**
 * @author FJ
 *
 */
public class Adresse {
	public String numVoie; // 42
	public String numVoieComplement; // bis
	public String type; // rue
	public String nom; // Colonel Chabert
	public String ville; //Paris
	public String codePostal; //75020
	public String adresseComplete;
	
	public Adresse(String adresse) {
		this.adresseComplete = adresse;
	}
	
	public void setAdresseComplete(String adresse) {
		this.adresseComplete = adresse;
	}
	
	public String getAdresse() {
		return adresseComplete;
	}
}
