import java.util.Scanner;
public class num02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		double num = 1, q, c, raiz;
		
		while(num > 0) {
			System.out.println("Informe o valor: ");
			num = sc.nextDouble();
			
			q = num * num;
			c = num * num * num;
			raiz = Math.sqrt(num);
			
			System.out.println(q);
			System.out.println(c);
			System.out.println(raiz);
		}
		
		sc.close();

	}

}
