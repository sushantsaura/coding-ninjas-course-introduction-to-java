package lecture1;
import java.util.Scanner;
public class test1ques2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
			if(j==i) {
				System.out.print("*");
			}else {
				System.out.print("0");
			}
		}
		for(int j=1;j<=(n-i+1);j++) {
			if(j==(n-i+1)) {
				System.out.print("*");
			}else {
				System.out.print("0");
			}
		}
		for(int j=1;j<=(n-i+1);j++) {
			if(j==(n-i+1)) {
				System.out.print("*");
			}else {
				System.out.print("0");
			}
		}
		for(int j=1;j<=i-1;j++) {
				System.out.print("0");
			
		}
       System.out.println();
	}

}
}
