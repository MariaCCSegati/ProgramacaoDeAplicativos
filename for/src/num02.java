import java.util.Scanner;

public class num02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int id = 0, p = 0, a = 0, idade1, idade2, idd = 0;
		double peso1, peso2, altura1, altura2, mediaI = 0, mediaA = 0, porce;
		
		for(int j1 = 1; j1 <= 11; j1++) {
			System.out.println("Insira a idade: ");
			idade1 = sc.nextInt();
			idd++;
			mediaI += idade1;
			System.out.println("Insira o peso: ");
			peso1 = sc.nextDouble();
			System.out.println("Insira a altura: ");
			altura1 = sc.nextDouble();
			a++;
			mediaA += altura1;
			
			if(idade1 < 18) {
				id++;
			}
			if(peso1 > 80) {
				p++;
			}
			
		}
		for(int j2 = 1; j2 <= 11; j2++) {
			System.out.println("Insira a idade: ");
			idade2 = sc.nextInt();
			idd++;
			mediaI += idade2;
			System.out.println("Insira o peso: ");
			peso2 = sc.nextDouble();
			System.out.println("Insira a altura: ");
			altura2 = sc.nextDouble();
			a++;
			mediaA += altura2;
			
			if(idade2 < 18) {
				id++;
			}
			if(peso2 > 80) {
				p++;
			}
			
		}

		System.out.println("Quantidade de jogadores menor que 18: " + id);
		System.out.println("Média das idades: " + (mediaI / idd));
		System.out.println("Média das alturas: " + (mediaA / a));
		System.out.println("Porcentagem de pessoas com mais de 80kg: " + ((p/22)*100) + "%");
		
		
		sc.close();
	}

}
