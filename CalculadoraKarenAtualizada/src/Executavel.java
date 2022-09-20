import java.util.Scanner;

public class Executavel {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double numero, numero2 = 0, soma = 0;
		
		System.out.println("Escola o cálculo: \n1- Soma \n2- Multiplicação "
				+ "\n3- Divisão \n4- Subtração \n5- Potenciação \n6- Porcentagem "
				+ "\n7- Raíz Quadrada: ");
		int opcao = sc.nextInt();
		
		System.out.println("Informe a quantidade de números 1-5: ");
        int qnt = sc.nextInt();
        
        if (opcao == 3 && qnt != 2 || opcao == 4 && qnt != 2 || opcao == 5 && qnt != 2 || opcao == 6 && qnt != 2) {
            System.out.println("Opcao inválida");
            main(args);
        } else if (opcao == 7 && qnt != 1) {
            System.out.println("Opcao inválida!");
            main(args);
        } else if (opcao != 1 && opcao != 2 && opcao != 7) {
            System.out.println("Informe o numero: ");
            numero = sc.nextDouble();
            System.out.println("Informe o outro número: ");
            numero2 = sc.nextDouble();
        }
        
        switch(opcao) {
        case 1:
        	 for (int i = 0; i < qnt; i++) {
        		 System.out.println("Informe o número: ");
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
