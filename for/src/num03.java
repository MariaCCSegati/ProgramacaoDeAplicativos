import java.util.Scanner;

public class num03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		 
		int fabric, sex;
		double aum;

		System.out.println("Qual � o sal�rio m�nimo: ");
		double sal = sc.nextDouble();
		
		for(int nOp = 1; nOp <= 15; nOp++) {
			 System.out.println("Insira o n�mero de pe�as fabricadas por mes: ");
			 fabric = sc.nextInt();
			 System.out.println("Insira seu genero: \n1.Homem \n2.Mulher");
			 sex = sc.nextInt();	
		 
			 
			 
			 if(fabric <= 30) {
				 System.out.println("Classe 1");
				 System.out.println("Sal�rio = " + sal);
			 }
			 
			 if(fabric >= 31 && fabric <= 50) {
				 System.out.println("Classe 2");
				 aum = sal * 0.03;
				 System.out.println("Sal�rio: R$" + aum);
			 }
			 
			 if(fabric > 50) {
				 System.out.println("Classe 3");
				 aum = sal * 0.05;
				 System.out.println("Sal�rio: R$" + aum);
				 
			 }
			 
		}
			 
		sc.close();
	}

	
}
