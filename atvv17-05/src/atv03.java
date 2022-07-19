import java.util.Scanner;
public class atv03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Digite um numero: ");
		double num1 = sc.nextDouble();
		
		System.out.println("Digite outro numero: ");
		double num2 = sc.nextDouble();
		
		if(num1 > num2) {
			System.out.printf("\nO numero %.0f é o maior", num1);
		}
		if (num2>num1) {
			System.out.printf("\nO numero %.0f é o maior", num2);
		}

	}

}
