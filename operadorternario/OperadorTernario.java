package operadorternario;

public class OperadorTernario {

	public static void main(String[] args) {
		/*Operador Ternario mostra condi��o entre duas variaveis e mostra apenas
		 * um resultado , � uma alternativa mais simples para substituir o if/else
		 * sendo  que s� podem ser atribuidos um valor a uma mesma variavel
		 */
	int n1 = 14;
	int n2 = 18;
	int resultado = (n1 > n2)?0:1; /* leia: n1 � maior que n2? se sim , mostre 0, se 
	*n�o , mostre 1.
	*/
	System.out.println(resultado); 
	// pode ser feito tamb�m dessa forma:
	int res = (n1>n2)? n1:n2; /*Leia: n1 � maior que n2? se sim, mostre o valor de 
	*n1, se n�o , mostre o valor de n2.
	*/
	System.out.println(res);// Como n1 N�O � maior que n2, entao o res = 18.
	// Tamb�m pode ser feita uma equa��o como tomada de decis�o:
	int resultado1 = (n1>n2)?(n1+n2):(n1-n2);
	System.out.println(resultado1);
	
	 
	}

}
