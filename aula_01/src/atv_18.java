import java.util.Scanner;

public class atv_18 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double base, altura, area;
		
		System.out.println("Insira o valor da base do triângulo: ");
		base= sc.nextDouble();
		System.out.println("Insira o valor da altura do triângulo: ");
		altura= sc.nextDouble();

		
		area = (base * altura)/ 2;
		
		
		System.out.println("a área é: " + area);

		sc.close();

	}

}
