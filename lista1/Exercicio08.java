package lista1;

import java.util.Scanner;

public class Exercicio08 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Digite a Base do Triagulo: ");
		float base = scanner.nextInt();
		System.out.print("Digite Altura do triangulo: ");
		float altura = scanner.nextInt();
		System.out.print("A area do triangulo é de "+(base*altura/2));
		
	}
}
