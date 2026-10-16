package objetos;

public class Pais {

	private String codigoISO;
	private String nome;
	private int populacao;
	private double dimensao;

	// Lista de países fronteiriços
	private Pais[] fronteiras = new Pais[40];

	// Controla quantas posições do array estão sendo utilizadas
	private int quantidadeFronteiras = 0;

	// A) Construtor
	public Pais(String codigo, String nome, double dimensao, int populacao) {

		this.codigoISO = codigo;
		this.nome = nome;
		this.dimensao = dimensao;
		this.populacao = populacao;
	}

	// B) GETTERS

	public String getCodigoISO() {
		return codigoISO;
	}

	public String getNome() {
		return nome;
	}

	public double getDimensao() {
		return dimensao;
	}

	public int getPopulacao() {
		return populacao;
	}

	// B) SETTERS

	public void setCodigoISO(String codigoISO) {
		this.codigoISO = codigoISO;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setDimensao(double dimensao) {
		this.dimensao = dimensao;
	}

	public void setPopulacao(int populacao) {
		this.populacao = populacao;
	}

	// C) Verifica se dois objetos representam o mesmo país

	public boolean mesmoPais(Pais outroPais) {

		if (codigoISO.equals(outroPais.getCodigoISO())) {
			return true;
		} else {
			return false;
		}
	}

	// Método auxiliar para adicionar países na lista de fronteiras

	public void adicionarFronteira(Pais outroPais) {

		if (quantidadeFronteiras < 40) {

			fronteiras[quantidadeFronteiras] = outroPais;

			quantidadeFronteiras++;
		}
	}

	// D) Verifica se outro país é limítrofe

	public boolean limitrofe(Pais outroPais) {

		for (int i = 0; i < quantidadeFronteiras; i++) {

			if (fronteiras[i].mesmoPais(outroPais)) {

				return true;
			}
		}

		return false;
	}

	// E) Calcula a densidade populacional

	public double densidadePopulacional() {

		return populacao / dimensao;
	}

	// F) Retorna os vizinhos em comum entre dois países

	public Pais[] vizinhosComuns(Pais outroPais) {

		// Array temporário com capacidade máxima de 40 países
		Pais[] comunsTemporario = new Pais[40];

		int quantidadeComuns = 0;

		// Percorre as fronteiras deste país
		for (int i = 0; i < quantidadeFronteiras; i++) {

			// Verifica se o outro país também faz fronteira
			// com o país que está sendo analisado
			if (outroPais.limitrofe(fronteiras[i])) {

				comunsTemporario[quantidadeComuns] = fronteiras[i];

				quantidadeComuns++;
			}
		}

		// Cria um array com o tamanho exato
		Pais[] comuns = new Pais[quantidadeComuns];

		// Copia os países encontrados
		for (int i = 0; i < quantidadeComuns; i++) {

			comuns[i] = comunsTemporario[i];
		}

		return comuns;
	}

	public static void main(String[] args) {

		// CRIAÇÃO DOS PAÍSES

		Pais pais = new Pais("BRA", "Brasil", 8_515_767.049, 212_812_405);

		Pais pais2 = new Pais("BRA", "Brasil", 8_515_767.049, 193_946_886);

		Pais pais3 = new Pais("ARG", "Argentina", 2_780_400, 45_851_378);

		Pais pais4 = new Pais("BOL", "Bolivia", 1_098_580, 12_581_843);

		Pais pais5 = new Pais("COL", "Colômbia", 1_140_619, 53_425_635);

		Pais pais6 = new Pais("GUY", "Guiana", 214_969, 842_221);

		Pais pais7 = new Pais("PRY", "Paraguai", 406_752, 7_000_000);

		Pais pais8 = new Pais("PER", "Peru", 1_285_216, 34_576_665);

		Pais pais9 = new Pais("SUR", "Suriname", 163_820, 639_850);

		Pais pais10 = new Pais("URY", "Uruguai", 176_220, 3_384_688);

		Pais pais11 = new Pais("VEN", "Venezuela", 912_050, 28_516_896);

		Pais pais12 = new Pais("GUF", "Guiana Francesa", 83_534, 298_554);

		Pais pais13 = new Pais("CHL", "Chile", 756_102, 19_700_000);

		Pais pais14 = new Pais("ECU", "Equador", 256_370, 18_300_000);

		// -----------------------------------------
		// FRONTEIRAS DO BRASIL
		// -----------------------------------------

		pais.adicionarFronteira(pais3); // Argentina
		pais.adicionarFronteira(pais4); // Bolívia
		pais.adicionarFronteira(pais5); // Colômbia
		pais.adicionarFronteira(pais6); // Guiana
		pais.adicionarFronteira(pais7); // Paraguai
		pais.adicionarFronteira(pais8); // Peru
		pais.adicionarFronteira(pais9); // Suriname
		pais.adicionarFronteira(pais10); // Uruguai
		pais.adicionarFronteira(pais11); // Venezuela
		pais.adicionarFronteira(pais12); // Guiana Francesa

		// -----------------------------------------
		// FRONTEIRAS DA ARGENTINA
		// -----------------------------------------

		pais3.adicionarFronteira(pais); // Brasil
		pais3.adicionarFronteira(pais4); // Bolívia
		pais3.adicionarFronteira(pais7); // Paraguai
		pais3.adicionarFronteira(pais10); // Uruguai
		pais3.adicionarFronteira(pais13); // Chile

		// -----------------------------------------
		// ITEM C
		// -----------------------------------------

		System.out.println("Os países são iguais? " + pais.mesmoPais(pais2));

		// -----------------------------------------
		// ITEM D
		// -----------------------------------------

		System.out.println("Colômbia é limítrofe do Brasil? " + pais.limitrofe(pais5));

		System.out.println("Chile é limítrofe do Brasil? " + pais.limitrofe(pais13));

		System.out.println("Equador é limítrofe do Brasil? " + pais.limitrofe(pais14));

		// -----------------------------------------
		// ITEM E
		// -----------------------------------------

		System.out.println("Densidade populacional do Brasil: " + pais.densidadePopulacional());

		System.out.println("Densidade populacional da Guiana Francesa: " + pais12.densidadePopulacional());

		// -----------------------------------------
		// ITEM F
		// -----------------------------------------

		Pais[] vizinhos = pais.vizinhosComuns(pais3);

		System.out.println("\nVizinhos em comum entre Brasil e Argentina:");

		for (int i = 0; i < vizinhos.length; i++) {

			System.out.println(vizinhos[i].getNome());
		}
	}
}