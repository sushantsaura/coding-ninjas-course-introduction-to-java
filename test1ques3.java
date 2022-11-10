package lecture1;
import java.util.Scanner;
public class test1ques3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int p=n;
      int count=0;
      int prod=1;
      int sum=0;
      while(p>0) {
    	  p=p%10;
    	  count++;
      }
      p=n;
      while(p>0){
    	  int rem=p%10;
    	  for(int i=1;i<count;i++) {
    		  prod=prod*rem;
    	  }
    	  sum=sum+prod;
    	  p=p/10;
      }
      if(sum==n) {
    	  System.out.print("it is armstrong number");
      }else {
    	  System.out.print("it is not armstring number");
      }
	}

}
