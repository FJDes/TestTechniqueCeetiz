package model;


public class Entreprise {
	private final String siret;
	private final String denomination;
	public TypeEntreprise type;
	
	public Entreprise(String siret, String denomination, TypeEntreprise type) {
		this.siret = siret;
		this.denomination = denomination;
		this.type = type;
	}
	
	public String getSiret() {
		return siret;
	}
	
	public String getDenomination() {
		return denomination;
	}
	
	public TypeEntreprise getType() {
		return type;
	}

}
