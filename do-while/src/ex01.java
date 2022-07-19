import java.util.Scanner;

public class ex01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Insira um número inteiro: ");
		int num = sc.nextInt();
		int div =0;
		int i = num;
		
		do {
			if(num % i == 0) {
				div++;
			}
			i--;
		} while (i > 0);
		
		if(div == 2) {
			System.out.println("numero primo");
		} else {
			System.out.println("numero não primo");
		}
		
		sc.close();	

	}
}
