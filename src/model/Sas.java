package model;

public class Sas extends Entreprise {

	public TypeEntreprise 	type;
	public Adresse 			adresse;
	public Sas(String siret, String denomination, String adresse) {
		super(siret, denomination, TypeEntreprise.SAS);
		this.adresse = new Adresse(adresse);
	}

}
