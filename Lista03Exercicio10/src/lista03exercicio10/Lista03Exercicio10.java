package lista03exercicio10;

import java.util.Scanner;

public class Lista03Exercicio10 {

	public static void main(String[] args) {
		
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Digite o primeiro valor");

			int valor1 = sc.nextInt();

			System.out.println("Digite o segundo valor");

			int valor2 = sc.nextInt();


			System.out.println ("O novo valor do valor 1 é:" + valor2);

			System.out.println ("O novo valor do valor 2 é: " + valor1);
		}
			
}}
