
package lecture1;
import java.util.Scanner;

public class test1Ques1 {
	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
	        int n=sc.nextInt();
	        int temp=n;
	        int sum=0;
	        int length = (int) (Math.log10(temp) + 1);
	        while(temp>0){
	           int rem=temp%10;
	            sum+=(Math.pow(rem,length));
	            temp=temp/10;
	        }
	        if(sum==n){
	            System.out.print("true");
	        }else{
	            System.out.print("false");
	        }

}
}
