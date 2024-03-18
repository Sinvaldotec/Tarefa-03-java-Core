package lista03exercicio04;

import java.util.Scanner;

public class lista03exercicio04 {

	public static void main(String[] args) {
		double imposto = 45, imposto1, imposto2,impostofinal,novo,fabricacao;

		double distribuidor = 0.28; 

		try (Scanner sc = new Scanner(System.in)) {
			System.out.println ("Digite o custo de fabricação");

			fabricacao = sc.nextInt();
		}

		imposto1 = fabricacao * imposto;
		imposto2 = fabricacao * distribuidor;
		impostofinal = imposto1 + imposto2;
		novo = impostofinal + fabricacao;

		System.out.println(" O custo final ao consumidor será de :  " + novo);


}}
