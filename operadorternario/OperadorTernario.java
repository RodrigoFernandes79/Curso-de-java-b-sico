package operadorternario;

public class OperadorTernario {

	public static void main(String[] args) {
		/*Operador Ternario mostra condição entre duas variaveis e mostra apenas
		 * um resultado , é uma alternativa mais simples para substituir o if/else
		 * sendo  que só podem ser atribuidos um valor a uma mesma variavel
		 */
	int n1 = 14;
	int n2 = 18;
	int resultado = (n1 > n2)?0:1; /* leia: n1 é maior que n2? se sim , mostre 0, se 
	*não , mostre 1.
	*/
	System.out.println(resultado); 
	// pode ser feito também dessa forma:
	int res = (n1>n2)? n1:n2; /*Leia: n1 é maior que n2? se sim, mostre o valor de 
	*n1, se não , mostre o valor de n2.
	*/
	System.out.println(res);// Como n1 NÃO é maior que n2, entao o res = 18.
	// Também pode ser feita uma equação como tomada de decisão:
	int resultado1 = (n1>n2)?(n1+n2):(n1-n2);
	System.out.println(resultado1);
	
	 
	}

}
