import java.util.Locale;
import java.util.Scanner;

public class Main4 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double c = sc.nextDouble();
		
		double area = a * b;
		double preco = area * c;
		
		System.out.printf("AREA = %.2f%n",  area);
		System.out.printf("PRECO = %.2f%n", preco);
	}

}
