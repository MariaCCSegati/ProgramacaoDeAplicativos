import java.util.Scanner;

public class atv_17 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double raio, area, peri;
		
		System.out.println("Insira o raio de um c�rculo: ");
		raio= sc.nextDouble();


		
		area = 3.14 * (raio * raio);
		peri = 3.14 * 2 * raio;
		
		System.out.println("a �rea �: " + area);
		System.out.println("o per�metro �: " + peri);
		sc.close();

	}

}
