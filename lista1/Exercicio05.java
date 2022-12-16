package lista1;
import java.util.Scanner;

public class Exercicio05 {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Digite o primeiro numero: ");
		int numero1 = scanner.nextInt();
		System.out.print("Digite o Segundo numero: ");
		int numero2 = scanner.nextInt();
		System.out.print("A multiplicação dos 2 numeros inteiros é igual a  "+ (numero1*numero2));
	}

}