package fr.diginamic.testenumeration;

import java.util.ArrayList;

public class testEnumeration {
	 public static void main(String[] args) {
	ArrayList<Saison> saisons= new ArrayList<Saison>();
	saisons.add(Saison.ETE);
	saisons.add(Saison.HIVER);
	saisons.add(Saison.PRINTEMPS);
	saisons.add(Saison.AUTOMNE);
	
	for(Saison saison: saisons) {
		System.out.println("saison");
	}
	Saison s= Saison.valueOf("ETE");
	System.out.println(s);
	Saison h=Saison.getEnumFromLibelle("hiver");
	System.out.println(h);
	 }
	 

}
