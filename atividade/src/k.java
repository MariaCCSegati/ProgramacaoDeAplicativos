import java.util.Scanner;

public class k {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int hora, min, conv1, conv2, seg; 

		System.out.println("Digite o valor da hora: ");
		hora = sc.nextInt();
		System.out.println("Digite o valor do minuto: ");
		min = sc.nextInt();
		
		conv1 = hora * 60;
		conv2 = min + conv1;
		seg = min * 60;

		
		System.out.println("hora em minutos: " + conv1);
		System.out.println("minutos + conversão anterior: " + conv2);
		System.out.println("minutos em segundos: " + seg);

		sc.close();

	}

}