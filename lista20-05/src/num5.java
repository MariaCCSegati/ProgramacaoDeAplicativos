import java.util.Scanner;
public class num5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		double aumento, novoSal;
		
		System.out.print("Digite o c�digo: ");
		int cod = sc.nextInt();
		System.out.print("Digite seu sal�rio atual: ");
		double sal = sc.nextInt();
		
		if(cod == 1) {
			System.out.print("\nSeu cargo � Escritu�rio");
			aumento = (sal * 50)/100;
			System.out.print("\nO aumento �: R$" + aumento);
			novoSal = aumento + sal;
			System.out.println("\nSeu novo sal�rio �: R$" + novoSal);
		} else if(cod == 2) {
			System.out.print("\nSeu cargo � Secret�rio");
			aumento = (sal * 35)/100;
			System.out.print("\nO aumento �: R$" + aumento);
			novoSal = aumento + sal;
			System.out.println("\nSeu novo sal�rio �: R$" + novoSal);
		} else if(cod == 3) {
			System.out.print("\nSeu cargo � Caixa");
			aumento = (sal * 20)/100;
			System.out.print("\nO aumento �: R$" + aumento);
			novoSal = aumento + sal;
			System.out.println("\nSeu novo sal�rio �: R$" + novoSal);
		} else if(cod == 4) {
			System.out.print("\nSeu cargo � Gerente");
			aumento = (sal * 10)/100;
			System.out.print("\nO aumento �: R$" + aumento);
			novoSal = aumento + sal;
			System.out.println("\nSeu novo sal�rio �: R$" + novoSal);
		}else if(cod == 5) {
			System.out.print("\nSeu cargo � Escritu�rio");
			System.out.print("\nN�o possui aumento");
			System.out.println("\nSeu sal�rio �: R$" + sal);
		}
		
		sc.close();
	}

}
