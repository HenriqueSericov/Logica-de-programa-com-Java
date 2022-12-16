package lista1;

import java.util.Scanner;

public class Exercicio07 {
	
	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		System.out.print("Digite a altura do retangulo: ");
		int altura = scanner.nextInt();
		System.out.print("Digite a base do retangulo: ");
		int base = scanner.nextInt();
		System.out.print("A area do retangulo é de "+(altura*base));
	}

}
