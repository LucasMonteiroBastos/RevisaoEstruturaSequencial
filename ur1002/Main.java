package ur1002;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double area = sc.nextDouble();
		double n = 3.14159;
		double raio = n * area * area;
		
		System.out.printf("A=%.4f%n",raio);

	}

}
