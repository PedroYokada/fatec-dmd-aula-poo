package br.edu.sp.cps.fatec.barueri.dmd.aula0210;

public class Main {

	public static void main(String[] args) {
		Gato g1 = new Gato();

		Gato g2 = new Gato("Nome", "Não sei", 3, "Branco");

		g1.miar();
		g2.miar();

		System.out.println(g1);
		g1.nome = "Abacatinho";
		System.out.println(g1);

		System.out.println(g2);
		g1.nome = "Bulbassauro";
		System.out.println(g1);
		
		System.out.println(g1.VARIAVEL_GATO);
		System.out.println(g2.VARIAVEL_GATO);
		
		// FAZ PARTE DA CLASSE E NAO DO OBJETO, POR ISSO ALTEROU 2 PARA GO G2
		g1.VARIAVEL_GATO = "2";
		System.out.println(g2.VARIAVEL_GATO);
	}

}
