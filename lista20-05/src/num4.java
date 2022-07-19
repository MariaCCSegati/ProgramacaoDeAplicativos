import java.util.Scanner;

public class num4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int horaT = 0, minT = 0;
		
		System.out.print("Escreva a hora inicial do jogo: ");
		int hora1 = sc.nextInt();
		
		System.out.print("Escreva os minutos iniciais do jogo: ");
		int min1 = sc.nextInt();
		
		System.out.print("Escreva a hora final do jogo: ");
		int hora2 = sc.nextInt();
		
		System.out.print("Escreva os minutos iniciais do jogo: ");
		int min2 = sc.nextInt();
		
		if (hora1 > 23) {
			System.out.println("hora inválida");
		} else if(min1 > 59) {
			System.out.println("hora inválida");
		} else if (hora2 > 23) {
			System.out.println("hora inválida");
		} else if(min2 > 59) {
			System.out.println("hora inválida");
		} else if (hora1 < hora2) {
			horaT = hora2 - hora1;
		} else if (hora1 > hora2) {
			horaT = (hora2 + 24) - hora1;
		}
		
		if (min1 > min2) {
			horaT = horaT - 1;
		}
		if(min1 < min2) {
			minT = min2 - min1;
		} else if(min1 > min2) {
			minT = (min2 + 60) - min1;
		}
		
		if(hora1 <= 23 || hora2 <= 23) {
			System.out.print("O tempo de duração do jogo foi de: " + horaT);
		}
		if(min1 <59 || min2 <59) {
			System.out.print(" horas e " + minT + " minutos");
		}

		sc.close();
		
	}

}
