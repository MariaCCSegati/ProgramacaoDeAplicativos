import java.util.Scanner;

public class atv06 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num;

        System.out.print("Digite um n�mero: ");
        num = sc.nextInt();

        if (num % 2 == 0) {
            System.out.print("� par!");
        }

        if (num % 2 == 1) {
            System.out.print("� impar!");
        }

        sc.close();
    }

}
