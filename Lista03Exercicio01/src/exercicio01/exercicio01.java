package exercicio01;

import java.util.Scanner;

public class exercicio01 {

	public static void main (String[]args) {

		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("informe a sua idade em anos");

			int anos= sc.nextInt();

			System.out.println("informe a sua idade em meses");

			int meses= sc.nextInt();

			System.out.println("informe a sua idade em dias");

			int dias= sc.nextInt();

			System.out.println (anos*360 + meses*30 + dias );
		}

		}}
