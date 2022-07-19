import java.util.Scanner;

public class l {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double ingT, custo, conta; 

		System.out.println("Digite o valor do ingresso do espetaculo teatral: ");
		ingT = sc.nextDouble();
		System.out.println("Digite o valor do custo do espetaculo teatral: ");
		custo = sc.nextDouble();
		
		conta = custo / ingT;
		
		System.out.println("A quantidade de ingressos para serem vendidos é: " + conta);

		sc.close();

	}

}