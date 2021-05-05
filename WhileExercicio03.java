package laçosderepetição;

import java.util.Scanner;

public class WhileExercicio03 {

	public static void main(String[] args) {
		/*Um posto de combustíveis  deseja determinar qual de seus produtos tem a preferencia de seus clientes.
		 * Escreva um algoritmo para ler o tipo de combustivel abastecido (codificado da seguinte forma:1Álcool
		 * 2: Gasolina 3: Diesel 4: Fim).Caso o usuário informe o código inválido (fora da faixa de 1 a 4) deve 
		 * ser solicitadoum novo código(até que seja válido).O programaserá encerrado quando o código informado 
		 * for o número 4. Deve ser escrito a mensagem "MUITO OBRIGADO" e a quantidade de clientes que abasteceram
		 * cada tipo de combustível.
		 * 
		 */
		Scanner tecla = new Scanner(System.in);
		System.out.println("Olá!Digite:\n 1 -Álcool\n 2- Gasolina\n 3-Diesel\n 4-Encerrar");
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
		System.out.println("Código inválido!");
		}
		System.out.println("Digite:\n 1 -Álcool\n 2- Gasolina\n 3-Diesel\n 4-Encerrar");
		codigo = tecla.nextInt();
				
		
		
	}System.out.println("MUITO OBRIGADO!");
	System.out.println("Alcool: " + alcool);
	System.out.println("Gasolina: " +gasolina);
	System.out.println("Diesel: " +diesel);

	}
}