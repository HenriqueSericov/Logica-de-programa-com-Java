package lista1;

import java.util.Scanner;

public class Exercicio12 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Digite o raio do circulo: ");
		int raio = scanner.nextInt();
		System.out.print("A area do circulo é de "+ (Math.PI*raio*raio));
		
	}
}
