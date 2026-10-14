package objetos;

public class Pais {

	private String codigoISO;
	private String nome;
	private int populacao;
	private double dimensao;

	public Pais(String codigo, String nome, double dimensao, int populacao) {
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

	public boolean equals(Pais outroPais) {
		if (codigoISO.equals(outroPais.codigoISO)) {
			return true;
		} else {
			return false;
		}
	}

	public static void main(String[] args) {
		Pais pais = new Pais("BRA", "Brasil", 8_515_767.049, 193_946_886);
		Pais pais2 = new Pais("BRA", "Brasil", 8_515_767.049, 193_946_886);

		System.out.println(pais.equals(pais2));
	}

}
