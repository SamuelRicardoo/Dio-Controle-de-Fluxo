package application;

import java.util.Scanner;

import enteties.exception.ParametroInvalidosExpetion;

public class Contador {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Digite o primeiro parâmetro: ");
		int n1 = sc.nextInt();
		System.out.print("Digite o segundo parâmetro: ");
		int n2 = sc.nextInt();

		try {
			contagem(n1, n2);
		} catch (ParametroInvalidosExpetion e) {
			System.out.print("O segundo parâmetro deve ser maior que o primeiro");
		}
	}

	static void contagem(int n1, int n2) throws ParametroInvalidosExpetion {
		if (n1 > n2) {
			throw new ParametroInvalidosExpetion("O segundo parâmetro deve ser maior que o primeiro");
		}
		int contagem = n2 - n1;
		
		for (int i = 1; i <= contagem; i++) {
			System.out.println("Imprimindo o número: " + i);
			
		}
	}

}
