package uri1008;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double n = sc.nextDouble();
		double horasTrab = sc.nextDouble();
		double valHora = sc.nextDouble();

		double salario = horasTrab * valHora;

		System.out.println("NUMBER = " + n);
		System.out.printf("SALARY = U$ %.2f%n", salario);
		sc.close();
	}

}
