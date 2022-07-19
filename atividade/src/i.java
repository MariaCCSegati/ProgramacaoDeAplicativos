import java.util.Scanner;

public class i {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double numH, sal, extra, total, Htrab, Extratrab, salb, salE;

		System.out.println("Digite o numero de horas trabalhadas: ");
		numH = sc.nextDouble();
		System.out.println("Digite o valor do salário minimo: ");
		sal = sc.nextDouble();
		System.out.println("Digite o numero de horas extras trabalhadas: ");
		extra = sc.nextDouble();

		Htrab = sal / 8;
		Extratrab = sal / 4;
		salb = numH * Htrab;
		salE = extra * Extratrab;
		total = salb + salE;

		System.out.println("O valor do salário é: " + total);

		sc.close();

	}

}
