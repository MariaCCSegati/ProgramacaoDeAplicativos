import java.util.Scanner;
public class b {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num1, num2, num3, multi;
		
		System.out.println("Insira um n�mero: ");
		num1 = sc.nextInt();
		System.out.println("Insira um n�mero: ");
		num2 = sc.nextInt();
		System.out.println("Insira um n�mero: ");
		num3 = sc.nextInt();
		
		multi = num1 * num2 * num3;
		
		System.out.println("A multiplica��o entre os n�meros �: " + multi );
		
		sc.close();

	}

}