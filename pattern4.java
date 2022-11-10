package lecture1;
import java.util.Scanner;
public class pattern4 {
	
	
		public static void main(String[] args) {
				Scanner sc=new Scanner(System.in);
		        int n=sc.nextInt();
		        int i=1;
		        while(i<=n){
		            int j=1;
	                int count=i;
		            while(j<=i){
		                System.out.print(count);
	                    count--;
		                j++;
		            
		            }
		            System.out.println();
		            i++;
		        }
				
			}

		}



