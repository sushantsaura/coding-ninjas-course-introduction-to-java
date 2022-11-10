package lecture1;
import java.util.Scanner;
public class sumPatter {
	
		
		public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	        int n=sc.nextInt();
	        int i=1;
	        while(i<=n){
	            int j=1;
	            int sum=0;
	            while(j<=i){
	                if(j!=i){
	                    sum=sum+j;
	                    System.out.print(j+"+");
	                    j++;
	                }
	                else{
	                    sum=sum+j;
	                    System.out.print(j+"="+sum);
	                    j++;
	                }
	            }
	            System.out.println();
	            i++;
	        }
		}
	}


