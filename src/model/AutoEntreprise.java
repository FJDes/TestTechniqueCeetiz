/**
 * 
 */
package model;


/**
 * @author FJ
 *
 */
public class AutoEntreprise extends Entreprise {
	public AutoEntreprise(String siret, String denomination) throws Throwable {
		super(siret, denomination, TypeEntreprise.AUTOENTREPRISE);
	}
}
