package model;


public class Entreprise {
	private final Siret siret;
	private final String denomination;
	public TypeEntreprise type;
	
	public Entreprise(String siret, String denomination, TypeEntreprise type) throws Throwable {
		if (siret == null || siret.isEmpty())
			throw new Exception("Une entreprise doit avoir un numéro de SIRET");
		if (denomination == null || denomination.isEmpty())
			throw new Exception("Une entreprise doit avoir une dénomination");
		if (type == null)
			throw new Exception("Le type d'entreprise doit etre spécifié");
		else {
			this.siret = new Siret(siret);
			this.denomination = Utils.formatString(denomination);
			this.type = type;
		}
	}
	
	public Siret getSiret() {
		return siret;
	}
	
	public String getDenomination() {
		return denomination;
	}
	
	public TypeEntreprise getType() {
		return type;
	}

}
