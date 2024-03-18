package lista03exercicio09;

import java.util.Scanner;

public class Lista03Exercicio09 {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Digite o valor da prestação");

			int valor = sc.nextInt();

			System.out.println("Digite o valor da taxa");

			int taxa = sc.nextInt();

			System.out.println("digite o tempo");

			int tempo = sc.nextInt();

			System.out.println ("O valor da prestação em atraso é de " + valor*taxa/100*tempo);
		}
	}
	}
