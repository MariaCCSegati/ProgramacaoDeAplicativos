import java.util.Scanner;

public class atv_20 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int anos, meses, dias, totalDias, x, y;
		
		System.out.println("Quantos anos vc tem?");
		anos= sc.nextInt();
		System.out.println("Quantos meses vc tem?");
		meses= sc.nextInt();
		System.out.println("Quantos dias vc tem?");
		dias = sc.nextInt();
		
		x = anos*365;
		y= meses * 30;
		totalDias = x+y+dias;
		
		System.out.println("A sua idade em dias é: " + totalDias);
		sc.close();
	}

}
