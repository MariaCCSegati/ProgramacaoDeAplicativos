import java.util.Scanner;

public class f {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double sal, sal2, cal;

		System.out.println("Digite o valor do sal�rio m�nimo: ");
		sal = sc.nextDouble();
		System.out.println("Digite o valor do sal�rio fixo: ");
		sal2 = sc.nextDouble();

		cal = sal2 / sal;

		System.out.println("A quantidade de sal�rios minimos �: " + cal);

		sc.close();

	}

}
