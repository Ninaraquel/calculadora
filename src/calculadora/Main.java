package calculadora;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		double n1, n2, resp;
		 
		
		System.out.print("Digite um número: ");
		n1 = sc.nextDouble();
		System.out.print("Digite o próximo número: ");
		n2 = sc.nextDouble();
		System.out.println("Escolha uma Operação: ");
		System.out.print("Digite 1 Adição, 2 Subtração, 3 Multiplicação, 4 Divisão: ");
		resp = sc.nextDouble();
		
		if(resp == 1) {
			System.out.printf("Resultado = %.0f" , n1 + n2 );
		}
		else if (resp == 2) {
			System.out.printf("Resultado = %.0f" , n1 - n2);
		}
		else if (resp == 3) {
			System.out.printf("Resultado = %.0f" , n1 * n2);
		}
		else if (resp == 4) {
			System.out.printf("Resultado = %.1f" , n1 / n2);
		}
		else {
			System.out.println("Opção inválida! ");
		}
		
		
		
	 sc.close();	
	}

}
