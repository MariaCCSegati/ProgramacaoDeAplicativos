import java.util.Scanner;

public class ex02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int i = 1, cod, numV, vit, veic = 0, mediaV = 0, mediaVit = 0, vitt = 0, maior = 0, menor = 999999999, codMenor = 0, codMaior = 0;
		
		do {
		System.out.println("Digite o código da cidade: ");
		cod = sc.nextInt();
		System.out.println("Digite o número de veículos de passeio: ");
		numV = sc.nextInt();
		veic++;
		mediaV += veic;
		System.out.println("Digite o número de acidentes de transito com vitimas: ");
		vit = sc.nextInt();
		
		if(veic < 2000) {
			vitt++;
			mediaVit += vit;
		}
		if(vit > maior) {
			maior = vit;
			codMaior = cod;
		}
		if(vit < menor) {
			menor = vit;
			codMenor = cod;
		}
		
		i++;
		
		} while (i <= 5);
		
		System.out.println("Menor índice de acidentes: " + menor + "\nCódigo: " + codMenor);
		System.out.println("Maior índice de acidentes: " + maior + "\nCódigo: " + codMaior);
		System.out.println("Média de veículos: " + (mediaV / 5));
		System.out.println("Média de acidentes de trânsito nas cidades com menos de 2.000 veículos: " + (mediaVit / vitt));
		
		sc.close();
	}

}
