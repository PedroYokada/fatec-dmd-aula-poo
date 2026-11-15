package pacote;

public class Main {

	public static void main(String[] args) {
		Pessoa andriele = new Pessoa("Andriele", 0);

		Pessoa pedro = new Pessoa("Pedro", 0);

		System.out.println(pedro.equals(andriele));
		
		System.out.println(pedro);
		System.out.println(andriele);
		
	}

}
