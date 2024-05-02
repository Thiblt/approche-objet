package entities;
import entities2.Personne;

public class TestPersonne {

	public static void main(String[] args) {
		Personne p1 = new Personne();
		p1.nom ="Dupont";
		p1.prénom ="Pierre";
		p1.adressePostale= new AdressePostale();
		p1.adressePostale.codePostal=49000;
		p1.adressePostale.numéroDeRue=12;
		p1.adressePostale.libélléDeRue= "avenue pasteur";
		p1.adressePostale.ville= "Angers";
		
		Personne p2 = new Personne();
		p2.nom ="Dupond";
		p2.prénom ="Jacque";
		p2.adressePostale= new AdressePostale();
		p2.adressePostale.numéroDeRue=23;
		p2.adressePostale.libélléDeRue= "rue henry picherit";
		p2.adressePostale.ville= "Nantes";
		p2.adressePostale.codePostal= 44000;
		

	}

}
