import java.util.Scanner;
public class a {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num1, num2,  sub;
		
		System.out.println("Insira um n�mero: ");
		num1 = sc.nextInt();
		System.out.println("Insira um n�mero: ");
		num2 = sc.nextInt();
		
		sub = num1 - num2;
		
		System.out.println("A subtra��o dos n�meros �: " + sub );
		
		sc.close();

	}

}
