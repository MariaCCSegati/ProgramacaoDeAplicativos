import java.util.Scanner;
public class num3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);

		double result1 = 0, result2 = 0;
		
		System.out.print("Digite a quantidade de livros: ");
		int qtd = sc.nextInt();
		System.out.println("Informe o critério escolhido: \n1.Critério A (1): R$0,25 por livro + R$7,50 fixo \n2.Critério B (2): R$0,50 por livro + R$2,50 fixo");
		int crit = sc.nextInt();
		
		
		switch (crit) {
		case 1:
			result1 = (qtd * 0.25) + 7.50;
		case 2:
			result2 = (qtd * 0.50) + 2.50;
		}
	
		if( result1 > result2 ) {
			System.out.println("A opção 2 é melhor");
			System.out.println("O valor da compra é: R$" + result2 );
		} else if (result1 < result2) {
			System.out.println("A opção 1 é melhor");
			System.out.println("O valor da compra é: R$" + result1);
		}
		
		
		
		sc.close();
	}

}
