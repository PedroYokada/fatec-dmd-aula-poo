package objetos;

public class Matriz {

	private int linhas;
	private int colunas;
	private double[][] elementos;

	// Construtor
	public Matriz(int linhas, int colunas) {

		if (linhas <= 0 || colunas <= 0) {
			throw new IllegalArgumentException("As dimensões devem ser maiores que zero.");
		}

		this.linhas = linhas;
		this.colunas = colunas;
		this.elementos = new double[linhas][colunas];
	}

	// Métodos de acesso
	public int getLinhas() {
		return linhas;
	}

	public int getColunas() {
		return colunas;
	}

	public double getElemento(int linha, int coluna) {
		return elementos[linha][coluna];
	}

	public void setElemento(int linha, int coluna, double valor) {
		elementos[linha][coluna] = valor;
	}

	// a) Comparação semântica
	public boolean mesmaMatriz(Matriz outraMatriz) {

		if (outraMatriz == null) {
			return false;
		}

		if (linhas != outraMatriz.linhas || colunas != outraMatriz.colunas) {
			return false;
		}

		for (int i = 0; i < linhas; i++) {

			for (int j = 0; j < colunas; j++) {

				if (Double.compare(elementos[i][j], outraMatriz.elementos[i][j]) != 0) {
					return false;
				}
			}
		}

		return true;
	}

	// b) Matriz transposta
	public Matriz transposta() {

		Matriz novaMatriz = new Matriz(colunas, linhas);

		for (int i = 0; i < linhas; i++) {

			for (int j = 0; j < colunas; j++) {
				novaMatriz.elementos[j][i] = elementos[i][j];
			}
		}

		return novaMatriz;
	}

	// c) Matriz oposta
	public Matriz oposta() {

		Matriz novaMatriz = new Matriz(linhas, colunas);

		for (int i = 0; i < linhas; i++) {

			for (int j = 0; j < colunas; j++) {
				novaMatriz.elementos[i][j] = -elementos[i][j];
			}
		}

		return novaMatriz;
	}

	// d) Matriz nula
	public Matriz matrizNula() {
		return new Matriz(linhas, colunas);
	}

	// e) Matriz identidade
	public boolean ehIdentidade() {

		if (linhas != colunas) {
			return false;
		}

		for (int i = 0; i < linhas; i++) {

			for (int j = 0; j < colunas; j++) {

				if (i == j) {

					if (elementos[i][j] != 1) {
						return false;
					}

				} else {

					if (elementos[i][j] != 0) {
						return false;
					}
				}
			}
		}

		return true;
	}

	// f) Matriz diagonal
	public boolean ehDiagonal() {

		if (linhas != colunas) {
			return false;
		}

		for (int i = 0; i < linhas; i++) {

			for (int j = 0; j < colunas; j++) {

				if (i != j && elementos[i][j] != 0) {
					return false;
				}
			}
		}

		return true;
	}

	// g) Matriz singular: uma matriz quadrada com determinante zero.
    // Aplica eliminação de Gauss com pivoteamento parcial sem alterar a original.
    public boolean ehSingular() {
        if (linhas != colunas) {
            return false;
        }

        double[][] copia = new double[linhas][colunas];
        double maiorValor = 0;

        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                copia[i][j] = elementos[i][j];
                maiorValor = Math.max(maiorValor, Math.abs(copia[i][j]));
            }
        }

        // Escala a tolerância para reduzir erros de arredondamento.
        double tolerancia = 1e-12 * maiorValor;

        for (int i = 0; i < linhas; i++) {
            int linhaPivo = i;

            for (int j = i + 1; j < linhas; j++) {
                if (Math.abs(copia[j][i]) > Math.abs(copia[linhaPivo][i])) {
                    linhaPivo = j;
                }
            }

            if (Math.abs(copia[linhaPivo][i]) <= tolerancia) {
                return true;
            }

            double[] temporaria = copia[i];
            copia[i] = copia[linhaPivo];
            copia[linhaPivo] = temporaria;

            for (int j = i + 1; j < linhas; j++) {
                double fator = copia[j][i] / copia[i][i];

                for (int k = i; k < colunas; k++) {
                    copia[j][k] -= fator * copia[i][k];
                }
            }
        }

        return false;
    }

	// h) Matriz simétrica
	public boolean ehSimetrica() {

		if (linhas != colunas) {
			return false;
		}

		for (int i = 0; i < linhas; i++) {

			for (int j = 0; j < colunas; j++) {

				if (elementos[i][j] != elementos[j][i]) {
					return false;
				}
			}
		}

		return true;
	}

	// i) Matriz anti-simétrica
	public boolean ehAntiSimetrica() {

		if (linhas != colunas) {
			return false;
		}

		for (int i = 0; i < linhas; i++) {

			for (int j = 0; j < colunas; j++) {

				if (elementos[j][i] != -elementos[i][j]) {
					return false;
				}
			}
		}

		return true;
	}

	// j) Adição de matrizes
	public void adicionar(Matriz outraMatriz) {

		if (linhas != outraMatriz.linhas || colunas != outraMatriz.colunas) {
			throw new IllegalArgumentException("As matrizes devem possuir as mesmas dimensões.");
		}

		for (int i = 0; i < linhas; i++) {

			for (int j = 0; j < colunas; j++) {
				elementos[i][j] = elementos[i][j] + outraMatriz.elementos[i][j];
			}
		}
	}

	// k) Subtração de matrizes
	public void subtrair(Matriz outraMatriz) {

		if (linhas != outraMatriz.linhas || colunas != outraMatriz.colunas) {
			throw new IllegalArgumentException("As matrizes devem possuir as mesmas dimensões.");
		}

		for (int i = 0; i < linhas; i++) {

			for (int j = 0; j < colunas; j++) {
				elementos[i][j] = elementos[i][j] - outraMatriz.elementos[i][j];
			}
		}
	}

	// l) Multiplicação de matrizes
	public void multiplicar(Matriz outraMatriz) {

		if (colunas != outraMatriz.linhas) {
			throw new IllegalArgumentException("Não é possível multiplicar essas matrizes.");
		}

		double[][] resultado = new double[linhas][outraMatriz.colunas];

		for (int i = 0; i < linhas; i++) {

			for (int j = 0; j < outraMatriz.colunas; j++) {

				double soma = 0;

				for (int k = 0; k < colunas; k++) {
					soma = soma + elementos[i][k] * outraMatriz.elementos[k][j];
				}

				resultado[i][j] = soma;
			}
		}

		this.colunas = outraMatriz.colunas;
		this.elementos = resultado;
	}

	// m) Cópia da matriz
	public Matriz copia() {

		Matriz novaMatriz = new Matriz(linhas, colunas);

		for (int i = 0; i < linhas; i++) {

			for (int j = 0; j < colunas; j++) {
				novaMatriz.elementos[i][j] = elementos[i][j];
			}
		}

		return novaMatriz;
	}

	public static void main(String[] args) {

	}
}