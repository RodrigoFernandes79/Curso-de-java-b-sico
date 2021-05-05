package laçosderepetição;

public class WhileContinueBreak {

	public static void main(String[] args) {
		int cc = 0; //contador recebe zero
			
		//podemos  usar o "continue;" para voltar para o looping antes da decisão:
		while (cc<10) {
			cc++;
			if (cc==6 || cc==7 ||cc==9) {
				continue;//continue volta pro laço toda vez que ele contar o contador
			}
			
			if (cc==8) {
				break;// break para na contagem numero 8
			}
			System.out.println("Pule"+ cc + "vezes");
			}
			
			
	}
		}
	


