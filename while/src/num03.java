import java.util.Scanner;
public class num03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		double num = 0;
        int i=0;
        double soma=0, ma=0, me=999999999, media=0;
		
		while(num != 30000) {
			
			System.out.println("Digite um número: ");
			num = sc.nextDouble();
			soma += num;
			
			
			if(num != 30000) {
				if(ma > num) {
	                ma = ma;
	            }else {
	                ma = num;
	            }
	            
	            if(me < num) {
	                me = me;
	            }else {
	                me = num;
	            }
	            
	            if(num%2==0) {
	                media+=num;
	            }
	            
	            i++;
	        }
			}
			
        media = media/i;
        
        System.out.println("maior valor digitado: "+ma);
        System.out.println("menor valor digitado: "+me);
        System.out.println("media dos numeros pares: "+media);
        System.out.println("soma de todos os numeros: "+soma);
			
        sc.close();
			
		}

	}


