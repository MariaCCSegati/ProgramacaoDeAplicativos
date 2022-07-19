import java.util.Scanner;
public class a {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num1, num2,  sub;
		
		System.out.println("Insira um número: ");
		num1 = sc.nextInt();
		System.out.println("Insira um número: ");
		num2 = sc.nextInt();
		
		sub = num1 - num2;
		
		System.out.println("A subtração dos números é: " + sub );
		
		sc.close();

	}

}
