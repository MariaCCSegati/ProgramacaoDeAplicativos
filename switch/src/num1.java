import java.util.Scanner;
public class num1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		double aumento, novo;
		
		System.out.println("Informe o c�digo do seu cargo: \n1.Escritu�rio \n2.Secret�rio \n3.Caixa \n4.Gerente \n5.Diretor");
		int cargo = sc.nextInt();
		System.out.println("Informe seu sal�rio: ");
		double sal = sc.nextDouble();
		
		switch(cargo) {
		case 1:
			System.out.println("Escritu�rio");
			aumento = (sal * 50)/100;
			novo = aumento + sal;
			System.out.println("Aumento: R$" + aumento + " \nNovo sal�rio: R$" + novo);
			break;
		case 2:
			System.out.println("Secret�rio");
			aumento = (sal * 35)/100;
			novo = aumento + sal;
			System.out.println("Aumento: R$" + aumento + " \nNovo sal�rio: R$" + novo);
			break;
		case 3:
			System.out.println("Caixa");
			aumento = (sal * 20)/100;
			novo = aumento + sal;
			System.out.println("Aumento: R$" + aumento + " \nNovo sal�rio: R$" + novo);
			break;
		case 4:
			System.out.println("Gerente");
			aumento = (sal * 10)/100;
			novo = aumento + sal;
			System.out.println("Aumento: R$" + aumento + " \nNovo sal�rio: R$" + novo);
			break;
		case 5:
			System.out.println("Caixa");
			System.out.println("N�o possui aumento");
			break;
		
		}
		
		sc.close();
	}

}
