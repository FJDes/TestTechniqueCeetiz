/**
 * 
 */
package model;

/**
 * @author FJ
 * 
 * enumerate all entreprise's type and there properties
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
	
	/**
	 * @return the enum's index
	 */
	public int getIndex() {
		return index;
	}
	
	/**
	 * @return the enum's name
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * @return the enum's tauxImpot
	 */
	public float getTauxImpot() {
		return tauxImpot;
	}
}
