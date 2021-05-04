package tiposprimitivos;

import java.util.Scanner;

public class EntradaDeDados {
/*Entrada de dados é usado para receber informações do teclado.
 * Ocorre quando pedimos ao usuario para digitar alguma informa
 * ção e o programa vai guardar essa informação.
 */
	public static void main(String[] args) {
		/*Para entrada de dados utilizamos a classe Scanner para 
		 * criar um ob
		 * jeto chamado teclado
		 */
		 Scanner teclado = new Scanner(System.in); 
		 /* Agora iremos ler o nome a ser atribuído:
		  * "String nome = teclado.nextline();"
		  * float nota = teclado.nextfloat();"
		  * Para dar mais interatividade, podemos mostrar mensagens na tela,
		  * usando saída de dados:
		  */
		System.out.println("Digite o seu nome:");
		String nome = teclado.nextLine(); //Insere dados do nome
		System.out.println("Digite sua nota:");
		float nota = teclado.nextFloat(); //Insere dados da nota
		/* Por fim  após inserir dados do nome e da nota, iremos mostrar na tela
		 * os dados(saída de dados):
		 */
		System.out.format("A nota de %s é %.2f ", nome, nota);
	
		
		


	}

}
