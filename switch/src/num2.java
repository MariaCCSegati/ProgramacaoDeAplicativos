
   import java.util.Scanner;

public class num2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		double x = 0, y, total;
		
		System.out.print("Digite o c�digo do produto (1 a 10): ");
		int cod = sc.nextInt();
		System.out.print("Informe o peso do produto em kg: ");
		double peso = sc.nextDouble();
		System.out.print("Digite o c�digo do pa�s (1 a 3): ");
		int cod2 = sc.nextInt();
		
		double grama = peso * 1000;
		
		System.out.println("peso do produto em gramas: " + grama);
		
		
		
		switch (cod) {
		case 1, 2 , 3, 4:
			x = grama * 0.10;
			System.out.println("O pre�o do produto �: " + x);
			break;
		case 5, 6, 7:
			x = grama * 0.25;
			System.out.println("O pre�o do produto �: " + x);
			break;
		case 8, 9, 10:
			x = grama * 0.35;
			System.out.println("O pre�o do produto �: " + x);
			break;
		
		}
		
		switch(cod2) {
		case 1:
			System.out.println("O pre�o total do produto �: " + x);
			break;
		case 2:
			y = x * 0.15;
			System.out.println("O pre�o do desconto �: " + y);
			total = y + x;
			System.out.println("O pre�o total do produto �: " + total);
			break;
		case 3: 
			y = x * 0.25;
			System.out.println("O pre�o do desconto �: " + y);
			total = y + x;
			System.out.println("O pre�o total do produto �: " + total);
			break;
		}
		
		
		
		sc.close();
	}

}
