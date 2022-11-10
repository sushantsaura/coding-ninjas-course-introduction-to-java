package lecture1;
import java.util.Scanner;
public class sumOfEvenOdd {
	

		
		public static void main(String[] args) {
		   Scanner sc=new Scanner(System.in);
	        int n=sc.nextInt();
	        int sumOdd=0;
	        int sumEven=0;
	        while(n>0){
	            int num=n%10;
	            if(num%2==0){
	                sumEven=sumEven+num;
	            }else{
	                sumOdd=sumOdd+num;
	            }
	            n=n/10;
	        }
	        System.out.print(sumEven +" ");
	         System.out.print(sumOdd);
		}
	}

