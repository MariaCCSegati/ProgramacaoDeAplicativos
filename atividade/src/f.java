import java.util.Scanner;

public class f {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double sal, sal2, cal;

		System.out.println("Digite o valor do salário mínimo: ");
		sal = sc.nextDouble();
		System.out.println("Digite o valor do salário fixo: ");
		sal2 = sc.nextDouble();

		cal = sal2 / sal;

		System.out.println("A quantidade de salários minimos é: " + cal);

		sc.close();

	}

}
