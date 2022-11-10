package lecture1;
import java.util.Scanner;

public class febonacciSeries {
			public static void main(String[] args) {
		   Scanner sc= new Scanner(System.in);
	        int n=sc.nextInt();
	        int f1=1;
	        int f2=1;
	        int f3=0;
	        int output;
	        if(n==1||n==2){
	         output=1;
	        }
	        else{
	        for(int i=0 ; i<n-2 ; i++){
	            f3=f1+f2;
	            f1=f2;
	            f2=f3;
	        }
	            output=f3;
	        }
	        System.out.print(output);
	        
		}

	}


