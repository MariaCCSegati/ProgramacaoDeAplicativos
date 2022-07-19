import java.util.Scanner;

public class num3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite o dia: ");
		int dia = sc.nextInt();
		System.out.print("Digite o mes: ");
		int mes = sc.nextInt();
		System.out.print("Digite o ano: ");
		int ano = sc.nextInt();
		System.out.print("Digite o dia: ");
		int dia2 = sc.nextInt();
		System.out.print("Digite o mes: ");
		int mes2 = sc.nextInt();
		System.out.print("Digite o ano: ");
		int ano2 = sc.nextInt();
		

		if (ano < ano2) {
			System.out.print(dia2 + "/" + mes2 + "/" + ano2 + " é maior que " + dia + "/" + mes + "/" + ano);
		} else if (ano>ano2) {
			System.out.println(dia + "/" + mes + "/" + ano + " é maior que " + dia2 + "/" + mes2 + "/" + ano2);
		} 
		if (ano == ano2) {
			if (mes < mes2) {
				System.out.println(dia2 + "/" + mes2 + "/" + ano2 + " é maior que " + dia + "/" + mes + "/" + ano);
			}
			if (mes > mes2) {
				System.out.println(dia + "/" + mes + "/" + ano + " é maior que " + dia2 + "/" + mes2 + "/" + ano2);
			}
			if (mes == mes2) {
				if (dia > dia2) {
					System.out.println(dia + "/" + mes + "/" + ano + " é maior que " + dia2 + "/" + mes2 + "/" + ano2);
				} else {
					System.out.println(dia2 + "/" + mes2 + "/" + ano2 + " é maior que " + dia + "/" + mes + "/" + ano);
				}
			}

		}
		sc.close();
	}

}
