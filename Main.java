import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		
		
		String product1 = "Computer";
		String product2 = "Office Desktop";
		
		int age = 30;
		int code = 5290;
		char gender = 'F';
		
		double prince1 = 2100.00;
		double prince2 = 650.50;
		double measure = 53.234567;	
		
		
		System.out.println("Products: ");
		System.out.printf("Computer, which prince is $ %.2f%n", + prince1);
		System.out.printf("Office Desktop, which prince is $ %.2f%n", + prince2);
		System.out.println(" ");
		System.out.printf("Record: %d year old, code %d and gender: %s", age, code, gender);
		System.out.println("");
		System.out.println("");
		System.out.printf("Measue with eight decimal places: %.8f%n", measure);
		System.out.printf("Rouded (three decimal places): %.3f%n", measure);
		Locale.setDefault(Locale.US);
		System.out.printf("US decimal point: %.3f%n", measure);
		
		
		
		
		
		
		
		
				
		
		
						
	}

}
