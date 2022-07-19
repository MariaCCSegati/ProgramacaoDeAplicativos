import java.util.Scanner;

public class num2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite o dia: ");
		int dia = sc.nextInt();
		System.out.print("Digite o mes: ");
		int mes = sc.nextInt();
		System.out.print("Digite o ano: ");
		int ano = sc.nextInt();
		System.out.print("Digite a hora: ");
		int hora = sc.nextInt();
		System.out.print("Digite o minuto: ");
		int min = sc.nextInt();

		if (mes == 2) {
			if (dia > 29) {
				System.out.print("dia inválido");
			}
		} else if (mes > 12) {
			System.out.print("mes inválido");
		} else if (dia > 31) {
			System.out.print("dia inválido");
		} else if (hora > 24) {
			System.out.print("hora inválida");
		} else if (min > 59) {
			System.out.print("minutos inválidos");
		}

		System.out.print("data: " + dia + " / ");

		if (mes == 1) {
			System.out.print("Janeiro / ");
		} else if (mes == 2) {
			System.out.print("Fevereiro / ");
		} else if (mes == 3) {
			System.out.print("Março / ");
		} else if (mes == 4) {
			System.out.print("Abril / ");
		} else if (mes == 5) {
			System.out.print("Maio / ");
		} else if (mes == 6) {
			System.out.print("Junho / ");
		} else if (mes == 7) {
			System.out.print("Julho / ");
		} else if (mes == 8) {
			System.out.print("Agosto / ");
		} else if (mes == 9) {
			System.out.print("Setembro / ");
		} else if (mes == 10) {
			System.out.print("Outubro / ");
		} else if (mes == 11) {
			System.out.print("Novembro / ");
		} else if (mes == 12) {
			System.out.print("Dezembro / ");
		}

		System.out.println(ano);



		System.out.println(hora + ":" + min);

		sc.close();

	}

}
