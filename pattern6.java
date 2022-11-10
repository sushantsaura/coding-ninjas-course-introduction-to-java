package lecture1;
import java.util.Scanner;
public class pattern6 {
	
		public static void main(String[] args) {
				Scanner sc=new Scanner(System.in);
		        int n=sc.nextInt();
		        int i=1;
	        
		        while(i<=n){
		            int j=1;
	                char count=(char)('A'+i-1);
		            while(j<=i){
		                System.out.print(count);
	                    count=(char)(count+1);
		                j++;
		            
		            }
		            System.out.println();
		            i++;
		        }
				
			}

		}





