import java.util.Scanner;

public class n {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double kg, grama, qtdRacao, conta, conta2; 

		System.out.println("Digite o peso do saco de ra��o: ");
		kg = sc.nextDouble();
		System.out.println("Digite o valor quantidade de ra��o fornecida para cada gato: ");
		qtdRacao = sc.nextDouble();
		
		grama = kg * 1000;
		conta = qtdRacao * 2;
		conta2 = grama - (conta *  5);
		
		System.out.println("O valor que restar� de ra��o no saco (em gramas) ap�s cinco dias �: " + conta2);
		
		
		sc.close();

	}

}