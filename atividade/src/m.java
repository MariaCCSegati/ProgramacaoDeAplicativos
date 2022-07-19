import java.util.Scanner;

public class m {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double watt, sal, c1, c2, c3; 

		System.out.println("Digite o valor do salario minimo: ");
		sal = sc.nextDouble();
		System.out.println("Digite o valor quantidade de quilowatts consumida: ");
		watt = sc.nextDouble();
		
		c1 = sal / 5;
		c2 = c1 * watt;
		c3 = (c2 * 75)/100;
		
		System.out.println("O valor de cada quilowatt é: " + c1);
		System.out.println("O valor a ser pago por essa residência é: " + c2);
		System.out.println("O valor a ser pago com desconto de 15% é: " + c3);
		
		sc.close();

	}

}