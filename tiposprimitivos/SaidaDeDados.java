package tiposprimitivos;

public class SaidaDeDados {
// sa�da de dados � usado para imprimir dados na tela(console)
	public static void main(String[] args) {
		float nota = 8.5f;
		String nome = "Rodrigo";
				System.out.println("A sua nota �: " + nota);
				//pode usar o format ou printf:
				System.out.printf("A sua nota � %.2f\n", nota);
				// usando o format:
				System.out.format("A nota de %s � %.2f",nome,nota);
	}

}
