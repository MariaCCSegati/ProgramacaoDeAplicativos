import java.util.Scanner;
public class num4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		double total;
		
		System.out.println("Informe o valor da compra: ");
		double compra = sc.nextDouble();
		System.out.println("Selecione o m�todo de pagamento: \n1.Pagamento � vista \n2.Pagamento com cheque pr�-datado para 30 dias \n3.Pagamento parcelado em 6 vezes \n4.Pagamento parcelado em 12 vezes");
		int pag = sc.nextInt();
		
		switch (pag) {
		case 1: 
			double vista = compra * 0.15;
			System.out.println("o valor do desconto a vista �: " + vista);
			total = compra - vista;
			System.out.println("o valor total da compra a vista �: " + total);
			break;
		case 2:
			double cheque = compra * 0.1;
			System.out.println("o valor do desconto em cheque �: " + cheque);
			total = compra - cheque;
			System.out.println("o valor do desconto em cheque �: " + total);
			break;
		case 3:
			total = compra / 6;
			System.out.println("n�o possui desconto para parcelamento em 6, ent�o o valor total �: " + compra + " e o valor de cada parcela �: " + total);
			break;
		case 4:
			double par12 = compra * 0.08;
			total = par12 + compra;
			double total2 = total / 12;
			System.out.println("o valor do acrescimo (juros) parcelando em 12 vezes �: " + par12 + " e o valor de cada parcela �: " + total2);
			break;
		}
		
		
		sc.close();

	}

}
