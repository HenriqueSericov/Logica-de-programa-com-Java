package lista1;

import java.util.Scanner;

public class Exercicio06 {
	
	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	System.out.print("Digite o numero que gostaria de dividir: ");
	float numero1 = scanner.nextInt();
	System.out.print("Digite o divisor: ");
	float numero2 = scanner.nextInt();
	System.out.print("O numero "+ numero1 + "dividido por "+ numero2 + " é igual a "+(numero1/numero2));
	}

}
