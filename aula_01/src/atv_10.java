import java.util.Scanner;

public class atv_10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x, ante, suce;
		
		System.out.println("Insira um n�mero inteiro: ");
		x = sc.nextInt();
		
		ante = x - 1;
		suce = x + 1;
		
		System.out.println("O antecessor do n�mero inserido �: " + ante);
		System.out.println("O sucessor do n�mero inserido �: " + suce);
		sc.close();

	}

}
