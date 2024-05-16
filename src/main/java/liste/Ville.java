package liste;

public class Ville {
	public String nom;
	public int nbHabitant;
	public Ville(String nom, int nbHabitant) {
		this.nom = nom;
		this.nbHabitant = nbHabitant;
	}
	@Override
	public String toString() {
		return "Ville [nom=" + nom + ", nbHabitant=" + nbHabitant + "]";
	}
	public boolean equals(Object o) {
		if(!(o instanceof Ville)) {
			return false;
		}
		Ville newVille=(Ville)o;
		return nom.equals(newVille.nom) && nbHabitant==newVille.nbHabitant;
	}
	
	
	
}
