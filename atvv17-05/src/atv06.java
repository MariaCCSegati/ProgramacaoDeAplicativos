import java.util.Scanner;

public class atv06 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num;

        System.out.print("Digite um número: ");
        num = sc.nextInt();

        if (num % 2 == 0) {
            System.out.print("É par!");
        }

        if (num % 2 == 1) {
            System.out.print("É impar!");
        }

        sc.close();
    }

}
