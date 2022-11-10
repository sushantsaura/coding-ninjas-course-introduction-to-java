package lecture1;
import java.util.Scanner;
public class printOddnumber {

		
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
	        int n=sc.nextInt();
	        int i=1;
	        while(i<=n){
	            int p=2*i-1;
	            int j=1;
	            while(j<=n-i+1){
	                System.out.print(p);
	                p=p+2;
	                j++;
	            }
	            j=1;
	            p=1;
	            while(j<=i-1){
	                System.out.print(p);
	                p=p+2;
	                j++;
	            }
	            System.out.println();
	            i++;
	        }
		}
	}

