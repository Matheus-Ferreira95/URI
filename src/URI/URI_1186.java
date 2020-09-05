package URI;
import java.util.Locale;
import java.util.Scanner;

public class URI_1186 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double[][]M = new double[12][12];
		double soma = 0, media = 0, cont = 0;
		
		char O = sc.next().toUpperCase().charAt(0);
		
		for (int l = 0; l < M.length; l++) {
			for (int c = 0; c < M[l].length; c++) {
				M[l][c] = sc.nextDouble();
			}
		}
		
		int aux = M.length - 1;
		for (int l = 0; l < M.length; l++) {
			for (int c = 0; c < M[l].length; c++) {
				if(c > aux) {
					soma += M[l][c];
					cont += 1;
				}				
			}
			aux--;
		}
		
		if(O == 'S') {
			System.out.printf("%.1f\n", soma);
		} else if(O == 'M') {
			media = soma / cont;
			System.out.printf("%.1f\n", media);
		}
		
		sc.close();

	}

}
