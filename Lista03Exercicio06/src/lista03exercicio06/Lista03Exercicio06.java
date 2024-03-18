package lista03exercicio06;

import java.util.Scanner;

public class Lista03Exercicio06 {

	public static void main(String[] args) {
		try (Scanner input = new Scanner(System.in)) {
			System.out.print("Digite o valor em Fahrenheit que deseja converter = ");

			double F = input.nextDouble();
					 
			double C =  ( F - 32.0 ) * ( 5.0 / 9.0 );
					        
			System.out.printf ( "Equivale a " + C + "Celsius");
		}

}
}
