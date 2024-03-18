package exercicio03;

import java.util.Scanner;

public class lista03exercicio03 {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Digite o Valor do salario atual");

			int salario= sc.nextInt();

			System.out.println("Digite o valor do reajuste em porcentagem");

			int reajuste= sc.nextInt();

			System.out.println(salario + reajuste/100);
		}

		 }

}
