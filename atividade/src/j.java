import java.util.Scanner;

public class j {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double valor, dolar, euro, esterlina;

		System.out.println("Digite o valor desejado para convers�o: ");
		valor = sc.nextDouble();
		
		dolar = valor / 4.97;
				
		euro = valor / 5.23;
		
		esterlina = valor / 6.25;

		System.out.println("O valor em dolar �: " + dolar);
		System.out.println("O valor em euro �: " + euro);
		System.out.println("O valor em libra esterlina �: " + esterlina);
		

		sc.close();

	}

}