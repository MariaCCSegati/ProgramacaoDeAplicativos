import java.util.Scanner;

public class num01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Informe um número:");
		int num = sc.nextInt();
		
		int result;
		
		for(int x = 1; x <=10; x++) {
			result = x * num;
			System.out.println(num + " x " + x + " = " + result);
		}
		
		sc.close();
	}

}
