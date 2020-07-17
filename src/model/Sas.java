package model;

/**
 * @author FJ
 *
 */
public class Sas extends Entreprise {

	public TypeEntreprise 	type;
	public Adresse 			adresse;
	public Sas(String siret, String denomination, String adresse) throws Throwable {
		super(siret, denomination, TypeEntreprise.SAS);
		if (adresse == null)
			throw new Exception("Une entreprise de type SAS doit avoir l'adresse du siege social");
		else {
			this.adresse = new Adresse(adresse);
		}
	}

}
