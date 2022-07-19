import java.util.Scanner;
public class num1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		double aumento, novo;
		
		System.out.println("Informe o código do seu cargo: \n1.Escrituário \n2.Secretário \n3.Caixa \n4.Gerente \n5.Diretor");
		int cargo = sc.nextInt();
		System.out.println("Informe seu salário: ");
		double sal = sc.nextDouble();
		
		switch(cargo) {
		case 1:
			System.out.println("Escrituário");
			aumento = (sal * 50)/100;
			novo = aumento + sal;
			System.out.println("Aumento: R$" + aumento + " \nNovo salário: R$" + novo);
			break;
		case 2:
			System.out.println("Secretário");
			aumento = (sal * 35)/100;
			novo = aumento + sal;
			System.out.println("Aumento: R$" + aumento + " \nNovo salário: R$" + novo);
			break;
		case 3:
			System.out.println("Caixa");
			aumento = (sal * 20)/100;
			novo = aumento + sal;
			System.out.println("Aumento: R$" + aumento + " \nNovo salário: R$" + novo);
			break;
		case 4:
			System.out.println("Gerente");
			aumento = (sal * 10)/100;
			novo = aumento + sal;
			System.out.println("Aumento: R$" + aumento + " \nNovo salário: R$" + novo);
			break;
		case 5:
			System.out.println("Caixa");
			System.out.println("Não possui aumento");
			break;
		
		}
		
		sc.close();
	}

}
