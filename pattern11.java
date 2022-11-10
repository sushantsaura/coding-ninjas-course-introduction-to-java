package lecture1;
import java.util.Scanner;
public class pattern11 {
	


		public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	        int n=sc.nextInt();
	        int i=1;
	        while(i<=n){
	            int j=1;
	            while(j<=n-i){
	                System.out.print(" ");
	                j++;
	            }
	            int p=i;
	             j=1;
	            while(j<=i){
	                System.out.print(p);
	                j++;
	                p++;
	            }
	            j=1;
	            int z=2*i-2;
	            while(j<=i-1){
	                 
	                System.out.print(z);
	                z--;
	                j++;
	            }
	            System.out.println();
	            i++;
	        }

			
		}

	}


