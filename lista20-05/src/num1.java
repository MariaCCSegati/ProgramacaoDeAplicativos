import java.util.Scanner;

public class num1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Menu de op��es: \n1. Somar dois n�meros \n2. Raiz quadrada de um n�mero \nDigite o n�mero desejado: ");
		int num = sc.nextInt();
		
		if(num == 1) {
			System.out.print("Digite o primeiro n�mero: ");
			int num1 = sc.nextInt();
			System.out.print("Digite o segundo n�mero: ");
			int num2 = sc.nextInt();
			
			int total = num1 + num2;
			
			System.out.print("a soma dos n�meros escolhidos �: " +total);
		} else if(num == 2) {
			System.out.print("Digite o n�mero: ");
			int num3 = sc.nextInt();
			
			int total2 = num3 * num3;
			
			System.out.println("o quadrado do n�mero escolhido �: " + total2);
		} else {
			System.out.println("op��o inv�lida!");
		}
		
		sc.close();

	}

}
