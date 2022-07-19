import java.util.Scanner;

public class n {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double kg, grama, qtdRacao, conta, conta2; 

		System.out.println("Digite o peso do saco de ração: ");
		kg = sc.nextDouble();
		System.out.println("Digite o valor quantidade de ração fornecida para cada gato: ");
		qtdRacao = sc.nextDouble();
		
		grama = kg * 1000;
		conta = qtdRacao * 2;
		conta2 = grama - (conta *  5);
		
		System.out.println("O valor que restará de ração no saco (em gramas) após cinco dias é: " + conta2);
		
		
		sc.close();

	}

}