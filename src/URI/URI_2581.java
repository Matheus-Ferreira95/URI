package URI;
import java.util.Scanner;

public class URI_2581 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String answerToorg = "I am Toorg!";
		int n = sc.nextInt();
		sc.nextLine();
		
		for (int i = 0; i < n; i++) {			
			String question = sc.nextLine();
			System.out.println(answerToorg);
		}		
		
		sc.close();
	}

}
