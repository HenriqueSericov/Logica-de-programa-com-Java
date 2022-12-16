package lista1;
import java.util.Scanner; 

public class Exercicio01 {

    public static void main(String[] args) {
    	
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número inteiro: ");
        int numero = scanner.nextInt();
        System.out.print("O sucessor de " + numero + " é " +(numero+1));
    }
}
