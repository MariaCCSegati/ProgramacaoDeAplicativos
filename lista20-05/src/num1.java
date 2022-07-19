import java.util.Scanner;

public class num1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Menu de opções: \n1. Somar dois números \n2. Raiz quadrada de um número \nDigite o número desejado: ");
		int num = sc.nextInt();
		
		if(num == 1) {
			System.out.print("Digite o primeiro número: ");
			int num1 = sc.nextInt();
			System.out.print("Digite o segundo número: ");
			int num2 = sc.nextInt();
			
			int total = num1 + num2;
			
			System.out.print("a soma dos números escolhidos é: " +total);
		} else if(num == 2) {
			System.out.print("Digite o número: ");
			int num3 = sc.nextInt();
			
			int total2 = num3 * num3;
			
			System.out.println("o quadrado do número escolhido é: " + total2);
		} else {
			System.out.println("opção inválida!");
		}
		
		sc.close();

	}

}
