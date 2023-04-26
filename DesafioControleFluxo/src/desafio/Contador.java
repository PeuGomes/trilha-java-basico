package desafio;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Contador {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Digite o primeiro parâmetro");
		int parametroUm = input.nextInt();
		do {
            try {
            	if(parametroUm <= 0) {
            		System.out.print("\nDigite um número inteiro. Ex: 1  \n");
            		parametroUm = input.nextInt();
            	}
            } catch (InputMismatchException e) {
                System.out.println("\nOps... você digitou caracteres. Precisamos que digite um número inteiro.");
            }
            input.nextLine();

        } while (parametroUm == 0);
		System.out.println("\nDigite o segundo parâmetro");
		int parametroDois = input.nextInt();
		do {
            try {
            	if(parametroDois <= 0) {
            		System.out.print("\nDigite um número inteiro. Ex: 1 \n");
            		parametroDois = input.nextInt();
            	}
            } catch (InputMismatchException e) {
                System.out.println("\nOps... você digitou caracteres. Precisamos que digite um número inteiro.");
            }
            input.nextLine();

        } while (parametroDois == 0);
		input.close();
		
		try {
			contar(parametroUm, parametroDois);
		
		}catch (ParametrosInvalidosException exception) {
			System.out.println(exception.getMessage());
		}
	
	}
	static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
		if(parametroUm > parametroDois) {
			throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
		}
		
		int contagem = parametroDois - parametroUm;
		
		for(int indice = 1; indice <= contagem; indice++) {
			System.out.printf("Imprimindo o n°: %d\n", indice);
		}
	}
}
