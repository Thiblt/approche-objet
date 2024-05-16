package liste;

public class TestEquals {

	public static void main(String[] args) {
		Ville v1= new Ville("Angers", 150000);
		Ville v2= new Ville("Angers", 150000);
		Ville v3= new Ville("Angers", 150001);
		Ville v4=v1;
		System.out.println(v1.equals(v2));
		System.out.println(v1.equals(v3));
		
		//test avec ==
		System.out.println(v1 ==v2);
		System.out.println(v1 ==v3);
		
		//test même espace mémoire
		System.out.println(v1==v4);

	}

}
