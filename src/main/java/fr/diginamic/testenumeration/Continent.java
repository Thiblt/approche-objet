package fr.diginamic.testenumeration;

public enum Continent {
    AFRIQUE("Afrique"),
    ASIE("Asie"),
    EUROPE("Europe"),
    AMERIQUE("Amérique"),
    OCEANIE("Oceanie");
	
	public String libelle;

	private Continent(String libelle) {
		this.libelle = libelle;
	}
	
}
