import java.util.Scanner;

public class atv_12 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num1, num2, soma;
		
		System.out.println("Insira um numero inteiro: ");
		num1 = sc.nextInt();
		System.out.println("Insira mais um numero inteiro: ");
		num2 = sc.nextInt();
		
		soma = num1 + num2;
		
		
		System.out.println("SOMA: " + soma);
		sc.close();

	}

}
