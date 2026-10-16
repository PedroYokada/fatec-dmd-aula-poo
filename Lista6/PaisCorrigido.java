package objetos;

public class PaisCorrigido {

	private String codigoISO;
	private String nome;
	private int populacao;
	private double dimensao;

	// Lista com no máximo 40 países fronteiriços
	private PaisCorrigido[] fronteiras = new PaisCorrigido[40];
	private int quantidadeFronteiras = 0;

	public PaisCorrigido(String codigo, String nome, double dimensao, int populacao) {
		this.codigoISO = codigo;
		this.dimensao = dimensao;
		this.nome = nome;
		this.populacao = populacao;
	}

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
	public boolean mesmoPais(PaisCorrigido outroPais) {

		if (codigoISO.equals(outroPais.getCodigoISO())) {
			return true;
		} else {
			return false;
		}
	}

	// Método auxiliar para adicionar fronteiras
	public void adicionarFronteira(PaisCorrigido outroPais) {

		if (quantidadeFronteiras < 40) {

			fronteiras[quantidadeFronteiras] = outroPais;

			quantidadeFronteiras++;
		}
	}

	// D) Verifica se outro país é limítrofe
	public boolean limitrofe(PaisCorrigido outroPais) {

		for (int i = 0; i < quantidadeFronteiras; i++) {

			if (fronteiras[i].mesmoPais(outroPais)) {
				return true;
			}
		}

		return false;
	}

	// E) Retorna a densidade populacional
	public double densidadePopulacional() {

		return populacao / dimensao;
	}

	// F) Retorna os países que são vizinhos em comum
	public PaisCorrigido[] vizinhosComuns(PaisCorrigido outroPais) {

		PaisCorrigido[] comunsTemporario = new PaisCorrigido[40];

		int quantidadeComuns = 0;

		for (int i = 0; i < quantidadeFronteiras; i++) {

			if (outroPais.limitrofe(fronteiras[i])) {

				comunsTemporario[quantidadeComuns] = fronteiras[i];

				quantidadeComuns++;
			}
		}

		PaisCorrigido[] comuns = new PaisCorrigido[quantidadeComuns];

		for (int i = 0; i < quantidadeComuns; i++) {

			comuns[i] = comunsTemporario[i];
		}

		return comuns;
	}

	public static void main(String[] args) {

		PaisCorrigido pais = new PaisCorrigido("BRA", "Brasil", 8_515_767.049, 212_812_405);

		PaisCorrigido pais2 = new PaisCorrigido("BRA", "Brasil", 8_515_767.049, 193_946_886);

		PaisCorrigido pais3 = new PaisCorrigido("ARG", "Argentina", 2_780_400, 45_851_378);

		PaisCorrigido pais4 = new PaisCorrigido("BOL", "Bolivia", 1_098_580, 12_581_843);

		PaisCorrigido pais5 = new PaisCorrigido("COL", "Colômbia", 1_140_619, 53_425_635);

		PaisCorrigido pais6 = new PaisCorrigido("GUY", "Guiana", 214_969, 842_221);

		PaisCorrigido pais7 = new PaisCorrigido("PRY", "Paraguai", 406_752, 7_000_000);

		PaisCorrigido pais8 = new PaisCorrigido("PER", "Peru", 1_285_216, 34_576_665);

		PaisCorrigido pais9 = new PaisCorrigido("SUR", "Suriname", 163_820, 639_850);

		PaisCorrigido pais10 = new PaisCorrigido("URY", "Uruguai", 176_220, 3_384_688);

		PaisCorrigido pais11 = new PaisCorrigido("VEN", "Venezuela", 912_050, 28_516_896);

		PaisCorrigido pais12 = new PaisCorrigido("GUF", "Guiana Francesa", 83_534, 298_554);

		PaisCorrigido pais13 = new PaisCorrigido("CHL", "Chile", 756_102, 19_700_000);

		PaisCorrigido pais14 = new PaisCorrigido("ECU", "Equador", 256_370, 18_300_000);

		// Países que fazem fronteira com o Brasil

		pais.adicionarFronteira(pais3);
		pais.adicionarFronteira(pais4);
		pais.adicionarFronteira(pais5);
		pais.adicionarFronteira(pais6);
		pais.adicionarFronteira(pais7);
		pais.adicionarFronteira(pais8);
		pais.adicionarFronteira(pais9);
		pais.adicionarFronteira(pais10);
		pais.adicionarFronteira(pais11);
		pais.adicionarFronteira(pais12);

		// Teste do item C
		System.out.println("Os países são iguais? " + pais.mesmoPais(pais2));

		// Testes do item D
		System.out.println("Colômbia é limítrofe do Brasil? " + pais.limitrofe(pais5));

		System.out.println("Chile é limítrofe do Brasil? " + pais.limitrofe(pais13));

		System.out.println("Equador é limítrofe do Brasil? " + pais.limitrofe(pais14));

		// Testes do item E
		System.out.println("Densidade populacional do Brasil: " + pais.densidadePopulacional());
		System.out.println("Densidade populacional da Guiana Francesa: " + pais12.densidadePopulacional());

	}
}