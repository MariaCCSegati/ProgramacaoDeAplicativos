import java.util.Scanner;

public class quizinho {

	public static void main(String[] args) {
		//declarando Scanner.
		Scanner sc = new Scanner(System.in);
		
		//declarando variáveis.
		int inicio, q1, q2, q3, q4, q5, q6, q7, q8, q9, q10, sol = 0, lua = 0;
		
		//Pergunta inicial que determina se o quiz será realizado ou não.
		System.out.println("Bem-vinde! Você deseja iniciar o quiz? \n1.SIM \n2.NÃO");
		inicio = sc.nextInt();
		
		//Estrutura de repetição que mostra as perguntas do quiz, juntamente com as respostas.
		//Enquanto inicio for igual a sim (1), o quiz será executado.
		while (inicio == 1) {
			
		//Perguntas do quiz. Elas estão sendo armazenadas em variáveis.
		System.out.println("Ok, vamos começar e descobrir se você é sol ou lua!");
		System.out.println("Você se considera uma pessoa extrovertida? \n1.Não \n2.Sim");
		q1 = sc.nextInt();
		System.out.println("Você tem muitos amigos? \n1.Não \n2.Sim");
		q2 = sc.nextInt();
		System.out.println("Você tem medo de falar em público? \n1.Sim \n2.Não");
		q3 = sc.nextInt();
		System.out.println("Você tinha muitos colegas na escola? \n1.Não \n2.Sim");
		q4 = sc.nextInt();
		System.out.println("Você desculpa as pessoas facilmente? \n1.Sim \n2.Não");
		q5 = sc.nextInt();
		System.out.println("Você se arrepende de coisas pequenas? \n1.Sim \n2.Não");
		q6 = sc.nextInt();
		System.out.println("Você é preso no passado? \n1.Sim \n2.Não");
		q7 = sc.nextInt();
		System.out.println("Você é grosso? \n1.Sim \n2.Não");
		q8 = sc.nextInt();
		System.out.println("Você escuta mais e fala menos? \n1.Sim \n2.Não");
		q9 = sc.nextInt();
		System.out.println("Você pensa bem antes de falar? \n1.Sim \n2.Não");
		q10 = sc.nextInt();
		
		//Estrutura de condição que possui um contador para contar quantas respostas foram sim e quantas respostas foram não.
		if(q1 == 1) {
			lua++;
		} else {
			sol++;
		}
		if(q2 == 1) {
			lua++;
		} else {
			sol++;
		}
		if(q3 == 1) {
			lua++;
		} else {
			sol++;
		}
		if(q4 == 1) {
			lua++;
		} else {
			sol++;
		}
		if(q5 == 2) {
			lua++;
		} else {
			sol++;
		}
		if(q6 == 1) {
			lua++;
		} else {
			sol++;
		}
		if(q7 == 1) {
			lua++;
		} else {
			sol++;
		}
		if(q8 == 1) {
			lua++;
		} else {
			sol++;
		}
		if(q9 == 1) {
			lua++;
		} else {
			sol++;
		}
		if(q10 == 1) {
			lua++;
		} else {
			sol++;
		}
		
		//estrutura de condição que compara se o contador lua é maior que o sol, menor que o sol ou igual ao sol, determinando o resultado final.
		if(lua > sol) {
			System.out.println("Voce é mais lua");
			System.out.println("           ..");
            System.out.println("        .' .-'`");
            System.out.println("       /  /");
            System.out.println("       |  |");
            System.out.println("       \\  '.___.;");
            System.out.println("         '._  _.'");
            System.out.println("            ``");
			
		} else if (lua < sol) {
			System.out.println("Voce é mais sol");
			System.out.println("      ;   :   ;\r\n"
					+ "   .   \\_,!,_/   ,\r\n"
					+ "    `.,'     `.,'\r\n"
					+ "     /         \\\r\n"
					+ "~ -- :         : -- ~\r\n"
					+ "     \\         /\r\n"
					+ "    ,'`._   _.'`.\r\n"
					+ "   '   / `!` \\   `\r\n"
					+ "      ;   :   ; ");
			
		} else if(lua == sol) {
			System.out.println("Voce é mais eclipse");
			System.out.println("       _..._     \r\n"
					+ "     .'  ::::.    \r\n"
					+ "    :    ::::::    \r\n"
					+ "    :    ::::::  \r\n"
					+ "    `.   :::::'  \r\n"
					+ "      `-.::''   ");
			
		}
		
		//Pergunta para verificar se o usuário deseja iniciar o quiz novamente.
		System.out.println("\nDeseja iniciar o quiz novamente? \n1.SIM \n2.NÃO");
		inicio = sc.nextInt();
		}	
		
		//Nome das criadoras.
		System.out.println("Criadoras: Letícia Sousa e Maria Segati");
		
		//Fechando Scanner.
		sc.close();
	}

}
