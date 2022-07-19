import java.util.Scanner;

public class quizinho {

	public static void main(String[] args) {
		//declarando Scanner.
		Scanner sc = new Scanner(System.in);
		
		//declarando vari�veis.
		int inicio, q1, q2, q3, q4, q5, q6, q7, q8, q9, q10, sol = 0, lua = 0;
		
		//Pergunta inicial que determina se o quiz ser� realizado ou n�o.
		System.out.println("Bem-vinde! Voc� deseja iniciar o quiz? \n1.SIM \n2.N�O");
		inicio = sc.nextInt();
		
		//Estrutura de repeti��o que mostra as perguntas do quiz, juntamente com as respostas.
		//Enquanto inicio for igual a sim (1), o quiz ser� executado.
		while (inicio == 1) {
			
		//Perguntas do quiz. Elas est�o sendo armazenadas em vari�veis.
		System.out.println("Ok, vamos come�ar e descobrir se voc� � sol ou lua!");
		System.out.println("Voc� se considera uma pessoa extrovertida? \n1.N�o \n2.Sim");
		q1 = sc.nextInt();
		System.out.println("Voc� tem muitos amigos? \n1.N�o \n2.Sim");
		q2 = sc.nextInt();
		System.out.println("Voc� tem medo de falar em p�blico? \n1.Sim \n2.N�o");
		q3 = sc.nextInt();
		System.out.println("Voc� tinha muitos colegas na escola? \n1.N�o \n2.Sim");
		q4 = sc.nextInt();
		System.out.println("Voc� desculpa as pessoas facilmente? \n1.Sim \n2.N�o");
		q5 = sc.nextInt();
		System.out.println("Voc� se arrepende de coisas pequenas? \n1.Sim \n2.N�o");
		q6 = sc.nextInt();
		System.out.println("Voc� � preso no passado? \n1.Sim \n2.N�o");
		q7 = sc.nextInt();
		System.out.println("Voc� � grosso? \n1.Sim \n2.N�o");
		q8 = sc.nextInt();
		System.out.println("Voc� escuta mais e fala menos? \n1.Sim \n2.N�o");
		q9 = sc.nextInt();
		System.out.println("Voc� pensa bem antes de falar? \n1.Sim \n2.N�o");
		q10 = sc.nextInt();
		
		//Estrutura de condi��o que possui um contador para contar quantas respostas foram sim e quantas respostas foram n�o.
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
		
		//estrutura de condi��o que compara se o contador lua � maior que o sol, menor que o sol ou igual ao sol, determinando o resultado final.
		if(lua > sol) {
			System.out.println("Voce � mais lua");
			System.out.println("           ..");
            System.out.println("        .' .-'`");
            System.out.println("       /  /");
            System.out.println("       |  |");
            System.out.println("       \\  '.___.;");
            System.out.println("         '._  _.'");
            System.out.println("            ``");
			
		} else if (lua < sol) {
			System.out.println("Voce � mais sol");
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
			System.out.println("Voce � mais eclipse");
			System.out.println("       _..._     \r\n"
					+ "     .'  ::::.    \r\n"
					+ "    :    ::::::    \r\n"
					+ "    :    ::::::  \r\n"
					+ "    `.   :::::'  \r\n"
					+ "      `-.::''   ");
			
		}
		
		//Pergunta para verificar se o usu�rio deseja iniciar o quiz novamente.
		System.out.println("\nDeseja iniciar o quiz novamente? \n1.SIM \n2.N�O");
		inicio = sc.nextInt();
		}	
		
		//Nome das criadoras.
		System.out.println("Criadoras: Let�cia Sousa e Maria Segati");
		
		//Fechando Scanner.
		sc.close();
	}

}
