import java.util.Scanner;

public class num04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o valor do salário mínimo: ");
		double salMin = sc.nextDouble();
		System.out.println("Quantidade gasta de quilowatts: ");
		double w = sc.nextDouble();
		System.out.println("tipo de consumidos: \n1.Residencial \n2.comercial \n3.industrial");
		int consu = sc.nextInt();

		double total = 0;
		while (w != 0) {

			double valorW = salMin / 8;
			double gasto = valorW * w;

			switch (consu) {
			case 1:
				total = gasto * 0.05;
				System.out.println("aumento: " + total);
				total++;
			case 2:
				total = gasto * 0.1;
				System.out.println("aumento: " + total);
				total++;
			case 3:
				total = gasto * 0.15;
				System.out.println("aumento: " + total);
				total++;
			default:
				System.out.println("numero invalido");

			}

		}

		System.out.println("lucro da empresa: " + total);

		sc.close();
	}

}
