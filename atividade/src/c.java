import java.util.Scanner;
public class c {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double num1, num2,  div;
		
		System.out.println("Insira um n�mero (diferente de zero): ");
		num1 = sc.nextDouble();
		System.out.println("Insira um n�mero: ");
		num2 = sc.nextDouble();
		
		div = num1 / num2;
		
		System.out.println("A divis�o entre os n�meros �: " + div );
		
		sc.close();

	}

}
