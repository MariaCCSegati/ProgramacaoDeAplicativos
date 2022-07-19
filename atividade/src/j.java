import java.util.Scanner;

public class j {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double valor, dolar, euro, esterlina;

		System.out.println("Digite o valor desejado para conversão: ");
		valor = sc.nextDouble();
		
		dolar = valor / 4.97;
				
		euro = valor / 5.23;
		
		esterlina = valor / 6.25;

		System.out.println("O valor em dolar é: " + dolar);
		System.out.println("O valor em euro é: " + euro);
		System.out.println("O valor em libra esterlina é: " + esterlina);
		

		sc.close();

	}

}