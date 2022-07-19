import java.util.Scanner;

public class atv_11 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String nome, end, tel;
		
		System.out.println("Insira seu nome: ");
		nome = sc.nextLine();
		System.out.println("Insira seu endereço: ");
		end = sc.nextLine();
		System.out.println("Insira seu telefone: ");
		tel = sc.nextLine();
		
		
		System.out.println("Seu nome é: " + nome);
		System.out.println("Seu endereço é: " + end);
		System.out.println("Seu telefone é: " + tel);
		sc.close();
		

	}

}
