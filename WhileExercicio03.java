package la�osderepeti��o;

import java.util.Scanner;

public class WhileExercicio03 {

	public static void main(String[] args) {
		/*Um posto de combust�veis  deseja determinar qual de seus produtos tem a preferencia de seus clientes.
		 * Escreva um algoritmo para ler o tipo de combustivel abastecido (codificado da seguinte forma:1�lcool
		 * 2: Gasolina 3: Diesel 4: Fim).Caso o usu�rio informe o c�digo inv�lido (fora da faixa de 1 a 4) deve 
		 * ser solicitadoum novo c�digo(at� que seja v�lido).O programaser� encerrado quando o c�digo informado 
		 * for o n�mero 4. Deve ser escrito a mensagem "MUITO OBRIGADO" e a quantidade de clientes que abasteceram
		 * cada tipo de combust�vel.
		 * 
		 */
		Scanner tecla = new Scanner(System.in);
		System.out.println("Ol�!Digite:\n 1 -�lcool\n 2- Gasolina\n 3-Diesel\n 4-Encerrar");
		int codigo = tecla.nextInt();
		int alcool = 0;
		int gasolina = 0;
		int diesel = 0;
		while(codigo!=4){
			if (codigo==1) {
			alcool++;
		}	else if (codigo==2) {
			gasolina++;
		}	else if (codigo==3) {
			diesel++;
		}else {
		System.out.println("C�digo inv�lido!");
		}
		System.out.println("Digite:\n 1 -�lcool\n 2- Gasolina\n 3-Diesel\n 4-Encerrar");
		codigo = tecla.nextInt();
				
		
		
	}System.out.println("MUITO OBRIGADO!");
	System.out.println("Alcool: " + alcool);
	System.out.println("Gasolina: " +gasolina);
	System.out.println("Diesel: " +diesel);

	}
}