import java.util.Scanner;

public class e {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double sal, comi, vendas, valor;
		System.out.println("Digite o valor do salário fixo: ");
		sal = sc.nextDouble();
		System.out.println("Digite o valor das vendas: ");
		vendas = sc.nextDouble();
		
		comi = (vendas * 4)/100;
		valor = sal + comi;
		
		System.out.println("O valor do salário + comissão é: " + valor);
		
		sc.close();

	}

}
