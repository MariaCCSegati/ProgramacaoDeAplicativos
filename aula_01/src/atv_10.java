import java.util.Scanner;

public class atv_10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x, ante, suce;
		
		System.out.println("Insira um número inteiro: ");
		x = sc.nextInt();
		
		ante = x - 1;
		suce = x + 1;
		
		System.out.println("O antecessor do número inserido é: " + ante);
		System.out.println("O sucessor do número inserido é: " + suce);
		sc.close();

	}

}
