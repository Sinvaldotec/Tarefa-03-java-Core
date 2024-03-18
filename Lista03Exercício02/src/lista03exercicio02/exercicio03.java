package lista03exercicio02;

import java.util.Scanner;

public class exercicio03 {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Digite o número de eleitores");

			int eleitores = sc.nextInt();

			System.out.println("Digite o votos válidos");

			int valido= sc.nextInt();

			System.out.println("Digite o votos  nulos");

			int nulos= sc.nextInt();
			
			System.out.println("Digite o votos brancos");

			int brancos= sc.nextInt();

   System.out.println ((valido/eleitores)*100);
   System.out.println ((nulos/eleitores)*100);
   System.out.println ((brancos/eleitores)*100);
		}
	   

	}
}

