package uri1010;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int codPeca = sc.nextInt();
		int peca = sc.nextInt();
		double valorPeca = sc.nextDouble();
		
		int codPeca2 = sc.nextInt();
		int peca2 = sc.nextInt();
		double valorPeca2= sc.nextDouble();
		
		double pecaValor1 = peca * valorPeca;
		double pecaValor2 = peca2 * valorPeca2;
		
		double valorTotal = pecaValor1 + pecaValor2;
		
		System.out.printf("VALOR A PAGAR: R$ %.2f%n",valorTotal);
		
		
		

	}

}
