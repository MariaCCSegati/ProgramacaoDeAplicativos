import java.util.Scanner;

public class atv07 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int i;
        double num1, num2, num3;

        System.out.print("I: ");
        i = sc.nextInt();
        System.out.print("A: ");
        num1 = sc.nextDouble();
        System.out.print("B: ");
        num2 = sc.nextDouble();
        System.out.print("C: ");
        num3 = sc.nextDouble();

        if (i == 1) {
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
        }
        
        if(i == 2) {
            if (num1 < num2 && num1 < num3) {

                if (num2 < num3) {
                    System.out.print(num3 + ", " + num2 + " e " + num1);
                }

                if (num3 < num2) {
                    System.out.print(num2 + ", " + num3 + " e " + num1);
                }
            }

            if (num2 < num1 && num2 < num3) {

                if (num1 < num3) {
                    System.out.print(num3 + ", " + num1 + " e " + num2);
                }

                if (num3 < num1) {
                    System.out.print(num1 + ", " + num3 + " e " + num2);
                }
            }

            if (num3 < num1 && num3 < num1) {

                if (num1 < num2) {
                    System.out.print(num2 + ", " + num1 + " e " + num3);
                }

                if (num2 < num1) {
                    System.out.print(num1 + ", " + num2 + " e " + num3);
                }
            }
        }
        
        if(i == 3) {
            
            if(num1 > num2 && num1 > num3) {
                System.out.print(num2 + ", " + num1 + " e " + num3);
            }
            
            if(num2 > num1 && num2 > num3) {
                System.out.print(num1 + ", " + num2 + " e " + num3);
            }
            
            if(num3 > num1 && num3 > num2) {
                System.out.print(num1 + ", " + num3 + " e " + num2);
            }
        }
        
        sc.close();
        
    }

}