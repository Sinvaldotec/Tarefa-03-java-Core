package lista03exercicio08;

import java.util.Scanner;

public class Lista03Exercicio08 {

	private static final String LitrosUsados = null;

	public static void main(String[] args) {
		try (Scanner entrada = new Scanner(System.in)) {
			double vm, Tempo, Autonomia = 12;

			double Distancia, LitrosUsados;		

			System.out.print("Digite o tempo que você gastou em sua viagem em H: ");

			Tempo = entrada.nextDouble();

			System.out.print("Digite o Velocidade Média em KM/H : ");

			vm = entrada.nextDouble();

			Distancia = vm * Tempo;
			LitrosUsados = Distancia / Autonomia;
			System.out.print("A Velocidade média foi de = " + vm + " Km/h");//velocidade média (VELOCIDADE)
			System.out.print("O Tempo gastona viagem foi de = " + Tempo + " horas");// tempo gasto na viagem (TEMPO)
			System.out.print("A Distancia Percorrida no percurso foi de = " + Distancia + " Km");//a distância percorrida (DISTÂNCIA)
		}

		System.out.print("Quantidade de Combustível utilizado foi de : " + LitrosUsados + " litros");// quantidade de litros (LITROS_USADOS)
}
}
