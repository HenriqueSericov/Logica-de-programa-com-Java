package lista1;

import java.util.Scanner;

public class Exercicio11 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Digite o tamanho da Base Menor do Trap�zio: ");
		int Bmenor = scanner.nextInt();
		System.out.print("Digite o tamanho da Base Maior do Trap�zio: ");
		int Bmaior = scanner.nextInt();
		System.out.print("Digite a altura do Trap�zio: ");
		int altura = scanner.nextInt();
		System.out.print("A area do Trap�zio � de "+(((Bmaior+Bmenor)*altura)/2));
	}

}
