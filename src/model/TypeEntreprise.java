/**
 * 
 */
package model;

/**
 * @author FJ
 *
 */
public enum TypeEntreprise {
	
	INCONNU(0, "", 0),
	AUTOENTREPRISE(1, "Auto-Entreprise", 25f),
	SAS(2, "SAS", 33f);
	
	private final int index;
	private final String name;
	private final float tauxImpot;
	
	private TypeEntreprise(int index, String name, float tauxImpot){
		this.index = index;
		this.name = name;
		this.tauxImpot = tauxImpot;
	}
	
	public int getIndex() {
		return index;
	}
	
	public String getName() {
		return name;
	}
	
	public float getTauxImpot() {
		return tauxImpot;
	}
}
