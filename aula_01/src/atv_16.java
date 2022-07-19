import java.util.Scanner;

public class atv_16 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double altura, base, area, peri;
		
		System.out.println("Insira um numero: ");
		altura = sc.nextDouble();
		System.out.println("Insira mais um numero : ");
		base = sc.nextDouble();

		
		area = base * altura;
		peri = base + altura + base + altura;
		
		System.out.println("a área é: " + area);
		System.out.println("o perímetro é: " + peri);
		sc.close();

	}

}
