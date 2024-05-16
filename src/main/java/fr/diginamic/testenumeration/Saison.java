package fr.diginamic.testenumeration;

public enum Saison {
	PRINTEMPS("printemps", 1),
	ETE("été", 2),
	AUTOMNE("Automne", 3),
	HIVER("hiver", 4);
	
	private String name;
	private int order;
	
	private Saison(String name, int order) {
		this.name = name;
		this.order = order;
	}
	
	public String getName() {
        return name;
    }

    public int getOrder() {
        return order;
    }

  
    public static Saison getEnumFromLibelle(String libelle) {
        for (Saison saison : values()) {
            if (saison.getName().equalsIgnoreCase(libelle)) {
                return saison;
            }
            
        }
        return null;
    }

	
}
