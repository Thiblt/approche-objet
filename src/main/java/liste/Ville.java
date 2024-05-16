package liste;

import fr.diginamic.testenumeration.Continent;

public class Ville {
	public String nom;
	public int nbHabitant;
	public Continent continent; 
	public Ville(String nom, int nbHabitant, Continent continent) {
		this.nom = nom;
		this.nbHabitant = nbHabitant;
		this.continent= continent;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public int getNbHabitant() {
		return nbHabitant;
	}
	public void setNbHabitant(int nbHabitant) {
		this.nbHabitant = nbHabitant;
	}
	public Continent getContinent() {
		return continent;
	}
	public void setContinent(Continent continent) {
		this.continent = continent;
	}
	
	@Override
	public String toString() {
		return "Ville [nom=" + nom + ", nbHabitant=" + nbHabitant + ", continent=" + continent + "]";
	}
	
	public boolean equals(Object o) {
		if(!(o instanceof Ville)) {
			return false;
		}
		Ville newVille=(Ville)o;
		return nom.equals(newVille.nom) && nbHabitant==newVille.nbHabitant;
	}
	
	
	
}
