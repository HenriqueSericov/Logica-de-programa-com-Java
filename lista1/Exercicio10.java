package lista1;

import java.util.Scanner;

public class Exercicio10 {
	public static void main (String[] args) {
		
		Scanner scanner = new Scanner (System.in);
		System.out.print("Digite o tamanho da diagonal menor do Losangulo: ");
		int Dmenor = scanner.nextInt();
		System.out.print("Digite o tamanho da diagonal maior do Losangulo: ");
		int Dmaior = scanner.nextInt();
		System.out.print("Digite a altura do Losangulo: ");
		int altura = scanner.nextInt();
		System.out.print("A area do Losangulo é de "+(((Dmenor+Dmenor)*altura)/2));
	}

}
