package lecture1;
import java.util.Scanner;
public class evenSum {
	
	

		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
	        int n=sc.nextInt();
	        int sum=0;
	        int i=0;
	        while(i<=n){
	            sum=sum+i;
	            i=i+2;
	        }
	        System.out.println(sum);
			
		}

	}

