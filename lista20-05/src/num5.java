import java.util.Scanner;
public class num5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		double aumento, novoSal;
		
		System.out.print("Digite o código: ");
		int cod = sc.nextInt();
		System.out.print("Digite seu salário atual: ");
		double sal = sc.nextInt();
		
		if(cod == 1) {
			System.out.print("\nSeu cargo é Escrituário");
			aumento = (sal * 50)/100;
			System.out.print("\nO aumento é: R$" + aumento);
			novoSal = aumento + sal;
			System.out.println("\nSeu novo salário é: R$" + novoSal);
		} else if(cod == 2) {
			System.out.print("\nSeu cargo é Secretário");
			aumento = (sal * 35)/100;
			System.out.print("\nO aumento é: R$" + aumento);
			novoSal = aumento + sal;
			System.out.println("\nSeu novo salário é: R$" + novoSal);
		} else if(cod == 3) {
			System.out.print("\nSeu cargo é Caixa");
			aumento = (sal * 20)/100;
			System.out.print("\nO aumento é: R$" + aumento);
			novoSal = aumento + sal;
			System.out.println("\nSeu novo salário é: R$" + novoSal);
		} else if(cod == 4) {
			System.out.print("\nSeu cargo é Gerente");
			aumento = (sal * 10)/100;
			System.out.print("\nO aumento é: R$" + aumento);
			novoSal = aumento + sal;
			System.out.println("\nSeu novo salário é: R$" + novoSal);
		}else if(cod == 5) {
			System.out.print("\nSeu cargo é Escrituário");
			System.out.print("\nNão possui aumento");
			System.out.println("\nSeu salário é: R$" + sal);
		}
		
		sc.close();
	}

}
