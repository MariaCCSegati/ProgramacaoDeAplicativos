import java.util.Scanner;
public class num6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int sal1, novo;
		
		System.out.print("Menu de op��es: \n1.Imposto \n2.Novo Sal�rio \n3.Classifica��o \nDigite a op��o desejada: ");
		int op = sc.nextInt();
		
		if(op == 1) {
			System.out.print("Digite o sal�rio: ");
			sal1 = sc.nextInt();
			if(sal1 < 500) {
				novo = (sal1 * 5)/100;
				System.out.println("O imposto �: R$" + novo);
			} else if(sal1 == 500 && sal1 <= 850) {
				novo = (sal1 * 10)/100;
				System.out.println("O imposto �: R$" + novo);
			} else if(sal1 > 850) {
				novo = (sal1 * 15)/100;
				System.out.println("O imposto �: R$" + novo);
			}
		} 
		if(op == 2) {
			System.out.print("Digite o sal�rio: ");
			sal1 = sc.nextInt();
			if(sal1 > 1500) {
				novo = sal1 + 25;
				System.out.println("O seu sal�rio � de: R$" + novo);
			} else if(sal1 > 750 && sal1 <= 1500) {
				novo = sal1 + 50;
				System.out.println("O seu sal�rio � de: R$" + novo);
			} else if(sal1 >= 450 && sal1 <= 750) {
				novo = sal1 + 75;
				System.out.println("O seu sal�rio � de: R$" + novo);
			} else if(sal1 < 450) {
				novo = sal1 + 100;
				System.out.println("O seu sal�rio � de: R$" + novo);
			}
		}
		if(op ==3) {
			System.out.print("Digite o sal�rio: ");
			sal1 = sc.nextInt();
			if(sal1 <= 700) {
				System.out.println("Mal remunerado");
			} else if (sal1 > 700) {
				System.out.println("Bem remunerado");
			}
		}
		if (op != 1 && op != 2 && op != 3) {
			System.out.println("op��o inv�lida");
		}
		
		
		sc.close();
	}

}
