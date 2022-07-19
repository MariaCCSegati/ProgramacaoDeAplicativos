import java.util.Scanner;

public class h {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double sal, c1, c2, porc1, porc2, rest;

		System.out.println("Digite o valor do salário: ");
		sal = sc.nextDouble();
		System.out.println("Digite o valor da primeira conta: ");
		c1 = sc.nextDouble();
		System.out.println("Digite o valor da segunda conta: ");
		c2 = sc.nextDouble();

		porc1 = (c1 * 102)/100;
		porc2 = (c2 * 102)/100;
		rest = sal - porc1 - porc2;

		System.out.println("O restante do salário é: " + rest);

		sc.close();

	}

}