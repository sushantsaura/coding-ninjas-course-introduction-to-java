package lecture1;
import java.util.Scanner;
public class primecheck {

	public static void main(String[] args) {
	

		
				
				/* Your class should be named Solution.
			 	* Read input as specified in the question.
			 	* Print output as specified in the question.
				*/
		        Scanner sc=new Scanner(System.in);
		        int n=sc.nextInt();
		        
		        for(int i=2 ; i<=n ; i++){
		            int count=0;
		            for(int j=2 ; j<=i/2;j++){
		                if(i%j==0){
		                    count++;
		                    j++;
		                    break;
		                
		                    
		                }
		         
		           
		            }
		            if(count==0){
		                System.out.println(i);
		        }
		        
		        }
				
			}
		

	}


