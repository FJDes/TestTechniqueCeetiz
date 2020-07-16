package model;


public class Entreprise {
	private final String siret;
	private final String denomination;
	public TypeEntreprise type;
	
	public Entreprise(String siret, String denomination, TypeEntreprise type) throws Throwable {
		if (siret == null || siret.isEmpty())
			throw new Exception("Une entreprise doit avoir un num�ro de SIRET");
		if (denomination == null || denomination.isEmpty())
			throw new Exception("Une entreprise doit avoir une d�nomination");
		if (type == null)
			throw new Exception("Le type d'entreprise doit etre sp�cifi�");
		else {
			this.siret = siret;
			this.denomination = denomination;
			this.type = type;
		}
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
