import java.util.Scanner;
public class c {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double num1, num2,  div;
		
		System.out.println("Insira um número (diferente de zero): ");
		num1 = sc.nextDouble();
		System.out.println("Insira um número: ");
		num2 = sc.nextDouble();
		
		div = num1 / num2;
		
		System.out.println("A divisão entre os números é: " + div );
		
		sc.close();

	}

}
