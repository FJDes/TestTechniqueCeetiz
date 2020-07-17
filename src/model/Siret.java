/**
 * 
 */
package model;

/**
 * @author FJ
 *
 */
public class Siret {
	private String siret;
	
	public Siret(String siret) throws Throwable {
		if (siret == null || siret.isEmpty())
			throw new Exception("Un numéro de SIRET ne peut etre vide");
		else
			this.setSiret(Utils.formatString(siret));
	}

	/**
	 * @return the siret
	 */
	public String getSiret() {
		return siret;
	}

	/**
	 * @param siret the siret to set
	 */
	private void setSiret(String siret) {
		this.siret = siret;
	}

}
