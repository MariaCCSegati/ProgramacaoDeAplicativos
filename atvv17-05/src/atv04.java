import java.util.Scanner;

public class atv04 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double num1, num2, num3;

        System.out.print("Digite o primeiro n�mero: ");
        num1 = sc.nextDouble();
        System.out.print("Digite o segundo n�mero: ");
        num2 = sc.nextDouble();
        System.out.print("Digite o terceiro n�mero: ");
        num3 = sc.nextDouble();

        System.out.println("Ordem crescente:");

        if (num1 < num2 && num1 < num3) {

            if (num2 < num3) {
                System.out.print(num1 + ", " + num2 + " e " + num3);
            }

            if (num3 < num2) {
                System.out.print(num1 + ", " + num3 + " e " + num2);
            }
        }

        if (num2 < num1 && num2 < num3) {

            if (num1 < num3) {
                System.out.print(num2 + ", " + num1 + " e " + num3);
            }

            if (num3 < num1) {
                System.out.print(num2 + ", " + num3 + " e " + num1);
            }
        }

        if (num3 < num1 && num3 < num1) {

            if (num1 < num2) {
                System.out.print(num3 + ", " + num1 + " e " + num2);
            }

            if (num2 < num1) {
                System.out.print(num3 + ", " + num2 + " e " + num1);
            }
        }

        sc.close();

    }

}