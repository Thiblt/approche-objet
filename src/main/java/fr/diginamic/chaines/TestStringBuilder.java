package fr.diginamic.chaines;

public class TestStringBuilder {

	public static void main(String[] args) {
		long debut = System.currentTimeMillis();
		StringBuilder build= new StringBuilder();
		for(int i=0; i<100000; i++) {
			build.append(Integer.toString(i));
		}
		build.toString();
		
		long fin = System.currentTimeMillis(); 
		
		System.out.println("Temps écoulé en millisecondes pour le StringBuilder :" + (fin - debut));
		
		long debutC = System.currentTimeMillis();
		String s="";
		for(int i=0; i<100000; i++) {
			s=s+Integer.toString(i);
		}
		
		long finC = System.currentTimeMillis(); 
		
		System.out.println("Temps écoulé en millisecondes pour la concatenation :" + (finC - debutC));
		long rapport= ((finC - debutC)/(fin - debut));
		System.out.println("Builder/concatenation="+ rapport );
	}

}
