package objetos;

public class Continente {

	private String nome_continente;
	private Pais[] paises = new Pais[48];
	private int quantidadePaises = 0;

	public Continente(String nome_continente) {
		this.nome_continente = nome_continente;
	}

	public void adicionarPaises(Pais pais) {
		if (quantidadePaises < 48) {
			paises[quantidadePaises] = pais;
			quantidadePaises++;
		}
	}

	public double dimensaoTotal() {
		double total = 0;

		for (int i = 0; i < quantidadePaises; i++) {
			total = total + paises[i].getDimensao();
		}

		return total;
	}

	public double populacaoTotal() {
		double populacao = 0;

		for (int i = 0; i < quantidadePaises; i++) {
			populacao = populacao + paises[i].getPopulacao();
		}

		return populacao;
	}

	public double densidadePopulacional() {
		return populacaoTotal() / dimensaoTotal();
	}

	public Pais maiorPopulacao() {

		if (quantidadePaises == 0) {
			return null;
		}

		Pais maior = paises[0];

		for (int i = 1; i < quantidadePaises; i++) {
			if (paises[i].getPopulacao() > maior.getPopulacao()) {
				maior = paises[i];
			}
		}

		return maior;
	}

	public Pais menorPopulacao() {

		if (quantidadePaises == 0) {
			return null;
		}

		Pais menor = paises[0];

		for (int i = 1; i < quantidadePaises; i++) {
			if (paises[i].getPopulacao() < menor.getPopulacao()) {
				menor = paises[i];
			}
		}

		return menor;
	}

	public Pais maiorDimensaoTerritorial() {

		if (quantidadePaises == 0) {
			return null;
		}

		Pais maiorDimensao = paises[0];

		for (int i = 1; i < quantidadePaises; i++) {
			if (paises[i].getDimensao() > maiorDimensao.getDimensao()) {
				maiorDimensao = paises[i];
			}
		}

		return maiorDimensao;
	}

	public Pais menorDimensaoTerritorial() {

		if (quantidadePaises == 0) {
			return null;
		}

		Pais menorDimensao = paises[0];

		for (int i = 1; i < quantidadePaises; i++) {
			if (paises[i].getDimensao() < menorDimensao.getDimensao()) {
				menorDimensao = paises[i];
			}
		}

		return menorDimensao;
	}

	public double razaoTerritorial() {

		Pais maior = maiorDimensaoTerritorial();
		Pais menor = menorDimensaoTerritorial();

		return maior.getDimensao() / menor.getDimensao();
	}

	public static void main(String[] args) {

		Continente americaSul = new Continente("América do Sul");

		Pais brasil = new Pais("BRA", "Brasil", 8_515_767.049, 212_812_405);
		Pais argentina = new Pais("ARG", "Argentina", 2_780_400, 45_851_378);
		Pais bolivia = new Pais("BOL", "Bolívia", 1_098_580, 12_581_843);
		Pais colombia = new Pais("COL", "Colômbia", 1_140_619, 53_425_635);
		Pais paraguai = new Pais("PRY", "Paraguai", 406_752, 7_000_000);
		Pais peru = new Pais("PER", "Peru", 1_285_216, 34_576_665);
		Pais suriname = new Pais("SUR", "Suriname", 163_820, 639_850);
		Pais uruguai = new Pais("URY", "Uruguai", 176_220, 3_384_688);
		Pais venezuela = new Pais("VEN", "Venezuela", 912_050, 28_516_896);

		americaSul.adicionarPaises(brasil);
		americaSul.adicionarPaises(argentina);
		americaSul.adicionarPaises(bolivia);
		americaSul.adicionarPaises(colombia);
		americaSul.adicionarPaises(paraguai);
		americaSul.adicionarPaises(peru);
		americaSul.adicionarPaises(suriname);
		americaSul.adicionarPaises(uruguai);
		americaSul.adicionarPaises(venezuela);

		System.out.println("Dimensão total do continente:");
		System.out.println(americaSul.dimensaoTotal() + " km²");

		System.out.println();

		System.out.println("População total do continente:");
		System.out.println(americaSul.populacaoTotal());

		System.out.println();

		System.out.println("Densidade populacional:");
		System.out.println(americaSul.densidadePopulacional() + " habitantes/km²");

		System.out.println();

		System.out.println("País com maior população:");
		System.out.println(americaSul.maiorPopulacao().getNome() + " - " + americaSul.maiorPopulacao().getPopulacao());

		System.out.println();

		System.out.println("País com menor população:");
		System.out.println(americaSul.menorPopulacao().getNome() + " - " + americaSul.menorPopulacao().getPopulacao());

		System.out.println();

		System.out.println("País com maior dimensão territorial:");
		System.out.println(americaSul.maiorDimensaoTerritorial().getNome() + " - "
				+ americaSul.maiorDimensaoTerritorial().getDimensao() + " km²");

		System.out.println();

		System.out.println("País com menor dimensão territorial:");
		System.out.println(americaSul.menorDimensaoTerritorial().getNome() + " - "
				+ americaSul.menorDimensaoTerritorial().getDimensao() + " km²");

		System.out.println();

		System.out.println("Razão territorial:");
		System.out.println(americaSul.razaoTerritorial());
	}
}