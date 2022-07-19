import java.util.Scanner;
public class ativ02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		double nota, nota2, nota3, media, nota4;
		
		System.out.println("insira a primeira nota: ");
		nota = sc.nextDouble();
		System.out.println("Insira a segunda nota: ");
		nota2 = sc.nextDouble();
		System.out.println("Insira a terceira nota: ");
		nota3= sc.nextDouble();
		
		media = (nota + nota2 + nota3) / 3;
		
		if(media >= 0 & media <= 3) {
			System.out.println("Reprovado");
		}
		if(media > 3 && media <= 7) {
			System.out.println("Em exame");
			 double nec = 12 - media;
			 System.out.println("Voce precisa tirar " + nec);
		}
		if (media > 7 && media <= 10) {
			System.out.println("Aprovado");
		}
		
		
		sc.close();
		
	}

}
