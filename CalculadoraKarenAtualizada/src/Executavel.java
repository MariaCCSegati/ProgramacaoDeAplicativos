import java.util.Scanner;

public class Executavel {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double numero, numero2 = 0, soma = 0;
		
		System.out.println("Escola o c�lculo: \n1- Soma \n2- Multiplica��o "
				+ "\n3- Divis�o \n4- Subtra��o \n5- Potencia��o \n6- Porcentagem "
				+ "\n7- Ra�z Quadrada: ");
		int opcao = sc.nextInt();
		
		System.out.println("Informe a quantidade de n�meros 1-5: ");
        int qnt = sc.nextInt();
        
        if (opcao == 3 && qnt != 2 || opcao == 4 && qnt != 2 || opcao == 5 && qnt != 2 || opcao == 6 && qnt != 2) {
            System.out.println("Opcao inv�lida");
            main(args);
        } else if (opcao == 7 && qnt != 1) {
            System.out.println("Opcao inv�lida!");
            main(args);
        } else if (opcao != 1 && opcao != 2 && opcao != 7) {
            System.out.println("Informe o numero: ");
            numero = sc.nextDouble();
            System.out.println("Informe o outro n�mero: ");
            numero2 = sc.nextDouble();
        }
        
        switch(opcao) {
        case 1:
        	 for (int i = 0; i < qnt; i++) {
        		 System.out.println("Informe o n�mero: ");
	             numero = sc.nextDouble();
	             Soma sominha = new Soma();
	              
        	 }
        	break;
        case 2:
        	break;
        case 3:
        	break;
        case 4:
        	break;
        case 5:
        	break;
        case 6:
        	break;
        case 7:
        	break;
        }

	}

}
