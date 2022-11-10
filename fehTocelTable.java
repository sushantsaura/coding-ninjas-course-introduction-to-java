package lecture1;
import java.util.Scanner;
public class fehTocelTable {
	
	


		public static void main(String[] args) {
			
			/* Your class should be named Solution.
		 	* Read input as specified in the question.
		 	* Print output as specified in the question.
			*/
	     Scanner sc=new Scanner(System.in);
	        int s=sc.nextInt();//starting fahrenheit
	        int e=sc.nextInt();//ending fahrenheit
	        int w=sc.nextInt();//gap between degrees
	        int fah;
	        while(s<=e){
	            fah=5*(s-32)/9;
	            System.out.println(s+" "+fah);
	            s=s+w;
	        }
			
		}

	}


