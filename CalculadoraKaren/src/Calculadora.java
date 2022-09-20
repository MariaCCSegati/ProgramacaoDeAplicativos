import java.util.Scanner;

public class Calculadora {
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        int opcao = 0;
	        double soma = 0, numero = 0, numero2 = 0, multiplicacao = 0, divisao = 0, subtracao = 0, potenciacao = 0,
	                porcentagem = 0, raiz = 0;

	        System.out.println(
	                "Escola o cálculo: \n1- Soma \n2- Multiplicação \n3- Divisão \n4- Subtração \n5- Potenciação \n6- Porcentagem \n7- Raíz Quadrada: ");
	        opcao = sc.nextInt();

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

	        switch (opcao) {
	        case 1:
	            for (int i = 0; i < qnt; i++) {
	                System.out.println("Informe o número: ");
	                numero = sc.nextDouble();
	                switch (opcao) {
	                case 1:
	                    soma += numero;
	                    break;
	                case 2:
	                    multiplicacao *= numero;
	                    break;
	                }
	            }
	            System.out.println(soma);
	            break;
	        case 2:
	            System.out.println(multiplicacao);
	            break;
	        case 3:
	            divisao = numero / numero2;
	            System.out.println(divisao);
	            break;
	        case 4:
	            subtracao = numero - numero;
	            System.out.println(subtracao);
	            break;
	        case 5:
	            potenciacao = Math.pow(numero, numero2);
	            System.out.println(potenciacao);
	            break;
	        case 6:
	            porcentagem = numero * (numero2 / 100);
	            System.out.println(porcentagem);
	            break;
	        case 7:
	            System.out.println("Informe o número da raiz quadrada: ");
	            numero = sc.nextDouble();
	            raiz = Math.sqrt(numero);
	            System.out.println(raiz);
	            break;
	        }

	        sc.close();
	 }
}
