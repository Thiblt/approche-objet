package entities;

public class TestAdressePostale {

	public static void main(String[] args) {
		AdressePostale a1 = new AdressePostale();
		a1.numéroDeRue=12;
		a1.libélléDeRue= "avenue pasteur";
		a1.ville= "Angers";
		a1.codePostal= 49000;
		
		AdressePostale a2 = new AdressePostale();
		a1.numéroDeRue=23;
		a1.libélléDeRue= "rue henry picherit";
		a1.ville= "Nantes";
		a1.codePostal= 44000;
		

	}

}
