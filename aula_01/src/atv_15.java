import java.util.Scanner;

public class atv_15 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		double num1, num2, media;
		
		System.out.println("Insira um numero: ");
		num1 = sc.nextDouble();
		System.out.println("Insira mais um numero : ");
		num2 = sc.nextDouble();

		
		media = (num1 + num2) / 2;
		
		
		System.out.println("MEDIA:" + media);
		sc.close();

	}

}
