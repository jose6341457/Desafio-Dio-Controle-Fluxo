import java.security.InvalidParameterException;
import java.util.Scanner;

/**
 * O sistema deverá receber dois parâmetros via terminal que representarão dois
 *números inteiros, com estes dois números você deverá obter a quantidade de 
 interações (for) e realizar a impressão no console (System.out.print) dos 
 números incrementados, exemplo:

Se você passar os números 12 e 30, logo teremos uma interação (for) com 18 
ocorrências para imprimir os números, exemplo: "Imprimindo o número 1",
 "Imprimindo o número 2" e assim por diante.
Se o primeiro parâmetro for MAIOR que o segundo parâmetro, você deverá lançar
 a exceção customizada chamada de ParametrosInvalidosException com a segunda
  mensagem: "O segundo parâmetro deve ser maior que o primeiro"
 */
public class Contador {

    public static void main(String[] args) throws PrametrosInvalidosException {

		Scanner terminal = new Scanner(System.in);
		boolean condição = true;

		while (condição) {

			System.out.println("Digite o primeiro parâmetro");
			int parametroUm = terminal.nextInt();
			System.out.println("Digite o segundo parâmetro");
			int parametroDois = terminal.nextInt();
			
			try{
	
			boolean validar = contar(parametroUm, parametroDois);

			if (validar == false) {
				condição = false;
			}
	
			}
			catch (PrametrosInvalidosException e) {
				//imprimir a mensagem: O segundo parâmetro deve ser maior que o 
				//primeiro
				System.out.println("O segundo parâmetro deve ser maior que o primeiro");
				System.out.println("");
				condição = true;
	 
			}

			}
		}
		
		//int iterar = parametroDois - parametroUm;
		//int i;
		//for(i = 1; i<= iterar; i++){

		//	System.out.println("Imprimindo o número " + i );

		
		public static boolean contar(int um, int dois) throws PrametrosInvalidosException{

			int contagem = dois - um;
			boolean validar = true;

			if (um > dois) {
					//validar se parametroUm é MAIOR que parametroDois e lançar a exceção
				throw new PrametrosInvalidosException();
			} else {
					//realizar o for para imprimir os números com base na variável contagem
				validar = false;
				for (int i = 1; i <= contagem; i ++) {
					System.out.println("Imprimindo o número " + i);
				}
				System.out.println("");
			}
		return validar;
		}
	}


		/*try {
			//chamando o método contendo a lógica de contagem
			contar(parametroUm, parametroDois);
		
		}catch (PrametrosInvalidosException e) {
			//imprimir a mensagem: O segundo parâmetro deve ser maior que o 
            //primeiro
            System.out.println("O segundo parâmetro deve ser maior que o primeiro");

		}
		
	}
	/**
	 * @param parametroUm
	 * @param parametroDois
	 * @throws ParametrosInvalidosException
	 */
	/*static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
		//validar se parametroUm é MAIOR que parametroDois e lançar a exceção
		if (int parametroUm > int parametroDois)             
        throw new = ParametrosInvalidosException();

		int contagem = parametroDois - parametroUm;
		//realizar o for para imprimir os números com base na variável contagem
        int x;
        for (x = 1; x <= contagem; contagem ++) {
            System.out.println(contagem);
            
        }*/
    
    
