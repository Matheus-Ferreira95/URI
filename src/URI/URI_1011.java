package URI;
import java.util.Locale;
import java.util.Scanner;

public class URI_1011 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double pi = 3.14159;
		
		double raio = sc.nextDouble();
		double volume = (4 / 3.0) * pi * Math.pow(raio, 3);
		
		System.out.printf("VOLUME = %.3f%n", volume);		
		
		sc.close();	
	}

}
