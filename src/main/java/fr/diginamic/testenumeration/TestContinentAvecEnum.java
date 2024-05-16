package fr.diginamic.testenumeration;

import java.util.ArrayList;

import liste.Ville;

public class TestContinentAvecEnum {

	public static void main(String[] args) {
		ArrayList<Ville> villes= new ArrayList<Ville>();
		villes.add(new Ville("NewYork", 1000000, Continent.AMERIQUE));
		villes.add(new Ville("Paris", 1000000, Continent.EUROPE));
		villes.add(new Ville("Pekin", 1000000, Continent.ASIE));
		villes.add(new Ville("Moscou", 1000000, Continent.EUROPE));
		villes.add(new Ville("Berlin", 1000000, Continent.EUROPE));
		villes.add(new Ville("Sydney", 1000000, Continent.OCEANIE));
		villes.add(new Ville("SaoPaulo", 1000000, Continent.AMERIQUE));
		villes.add(new Ville("Dakar", 1000000, Continent.AFRIQUE));
		
		for(Ville ville: villes) {
			System.out.println(ville.getContinent());
		}

	}

}
