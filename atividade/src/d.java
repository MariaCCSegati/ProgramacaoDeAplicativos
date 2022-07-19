import java.util.Scanner;
public class d {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double num1, porc;
		
		System.out.println("Insira o valor do produto: ");
		num1 = sc.nextDouble();

		
		porc = (num1 * 90)/100;
		
		System.out.println("O novo preço é: " + porc );
		
		sc.close();

	}

}
