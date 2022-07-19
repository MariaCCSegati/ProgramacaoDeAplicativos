import java.util.Scanner;
public class num01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Carlos, digite seu salário: ");
		double salC = sc.nextDouble();
		int cont=0;
		
		double salJ = salC / 3;
		
		while (salC > salJ) {

			salC *= 1.02;
			salJ *= 1.05;
			
			cont++;
			
		}
		System.out.println(cont);
		sc.close();

	}

}
