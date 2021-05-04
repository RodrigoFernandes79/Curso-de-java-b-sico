package tiposprimitivos;

public class SaidaDeDados {
// saída de dados é usado para imprimir dados na tela(console)
	public static void main(String[] args) {
		float nota = 8.5f;
		String nome = "Rodrigo";
				System.out.println("A sua nota é: " + nota);
				//pode usar o format ou printf:
				System.out.printf("A sua nota é %.2f\n", nota);
				// usando o format:
				System.out.format("A nota de %s é %.2f",nome,nota);
	}

}
