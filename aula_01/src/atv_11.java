import java.util.Scanner;

public class atv_11 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String nome, end, tel;
		
		System.out.println("Insira seu nome: ");
		nome = sc.nextLine();
		System.out.println("Insira seu endere�o: ");
		end = sc.nextLine();
		System.out.println("Insira seu telefone: ");
		tel = sc.nextLine();
		
		
		System.out.println("Seu nome �: " + nome);
		System.out.println("Seu endere�o �: " + end);
		System.out.println("Seu telefone �: " + tel);
		sc.close();
		

	}

}
