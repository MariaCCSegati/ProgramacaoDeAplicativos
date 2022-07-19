import java.util.Scanner;

public class atv05 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double num1, num2, num3, num4;

        System.out.println("Digite em ordem crescente os três primeiros!");
        System.out.print("Digite o primeiro número: ");
        num1 = sc.nextDouble();
        System.out.print("Digite o segundo número: ");
        num2 = sc.nextDouble();
        System.out.print("Digite o terceiro número: ");
        num3 = sc.nextDouble();
        System.out.print("Digite o quarto número: ");
        num4 = sc.nextDouble();

        if (num4 > num3) {
            System.out.print(num4 + ", " + num3 + ", " + num2 + " e " + num1);
        }

        if (num4 < num3 && num4 > num2) {
            System.out.print(num3 + ", " + num4 + ", " + num2 + " e " + num1);
        }

        if (num4 < num2 && num4 > num1) {
            System.out.print(num3 + ", " + num2 + ", " + num4 + " e " + num1);
        }

        if (num4 < num1) {
            System.out.print(num3 + ", " + num2 + ", " + num1 + " e " + num4);
        }

        sc.close();

    }

}