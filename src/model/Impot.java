/**
 * 
 */
package model;

/**
 * @author FJ
 *
 */
public final class Impot {
	
	public static double impotCalculation(double Ca, Entreprise entreprise) throws Throwable {
		if (Ca > 0) {
			if (TypeEntreprise.AUTOENTREPRISE.getIndex() == entreprise.getType().getIndex()) {
				return autoEntrepriseImpotCalculation(Ca);
			}
			else if (TypeEntreprise.SAS.getIndex() == entreprise.getType().getIndex()) {
				return sasImpotCalculation(Ca);
			}
			throw new Exception("Type d'entreprise inconnu");
		} throw new Exception("Le CA doit etre sup�rieur a 0");
	}
	
	public static double autoEntrepriseImpotCalculation(double Ca) {
		return Utils.pourcentageReduce(Ca, TypeEntreprise.AUTOENTREPRISE.getTauxImpot());	
	}
	
	public static double sasImpotCalculation(double Ca) {
		return Utils.pourcentageReduce(Ca, TypeEntreprise.SAS.getTauxImpot());
	}
}
