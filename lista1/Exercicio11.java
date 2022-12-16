package lista1;

import java.util.Scanner;

public class Exercicio11 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Digite o tamanho da Base Menor do Trapézio: ");
		int Bmenor = scanner.nextInt();
		System.out.print("Digite o tamanho da Base Maior do Trapézio: ");
		int Bmaior = scanner.nextInt();
		System.out.print("Digite a altura do Trapézio: ");
		int altura = scanner.nextInt();
		System.out.print("A area do Trapézio é de "+(((Bmaior+Bmenor)*altura)/2));
	}

}
